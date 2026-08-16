class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> map = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!map.isEmpty() && temperatures[i] > temperatures[map.peek()]) {
                int prev = map.pop();
                answer[prev] = i - prev;
            }
            map.push(i);
        }
        return answer;
    }
}
