class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> graph = new HashMap<>();
        Set<String> level = new HashSet<>();
        level.add(beginWord);
        while (!level.isEmpty()) {
            dict.removeAll(level);
            Set<String> nextLevel = new HashSet<>();
            for (String word : level) {
                char[] arr = word.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char old = arr[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[i] = c;
                        String newWord = new String(arr);
                        if (dict.contains(newWord)) {
                            nextLevel.add(newWord);
                            graph.computeIfAbsent(newWord, k -> new ArrayList<>()).add(word);
                        }
                    }
                    arr[i] = old;
                }
            }
            if (nextLevel.contains(endWord)) break;
            level = nextLevel;
        }
        if (graph.containsKey(endWord))
            backtrack(res, new ArrayList<>(), endWord, beginWord, graph);
        return res;
    }

    private void backtrack(List<List<String>> res, List<String> path, String word, String beginWord, Map<String, List<String>> graph) {
        if (word.equals(beginWord)) {
            path.add(word);
            Collections.reverse(path);
            res.add(new ArrayList<>(path));
            Collections.reverse(path);
            path.remove(path.size() - 1);
            return;
        }
        path.add(word);
        if (graph.containsKey(word)) {
            for (String prev : graph.get(word))
                backtrack(res, path, prev, beginWord, graph);
        }
        path.remove(path.size() - 1);
    }
}
