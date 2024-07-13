class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        
        int[][] robots = new int[positions.length][3];
        for(int i = 0; i < positions.length; i++){
            robots[i][0] = positions[i];
            robots[i][1] = healths[i];
            robots[i][2] = i;
        }
        
        Arrays.sort(robots, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> stack = new LinkedList<>();
        
        for(int i = 0; i < positions.length; i++){
            if(directions.charAt(robots[i][2]) == 'R'){
                stack.push(robots[i]);
            }
            else{
                while(!stack.isEmpty() && directions.charAt(stack.peek()[2]) == 'R'){
                    if(stack.peek()[1] > robots[i][1]){
                        stack.peek()[1]--;;
                        robots[i][1] = 0;
                        break;
                    }
                    else if(stack.peek()[1] < robots[i][1]){
                        robots[i][1]--;
                        stack.pop();
                    }
                    else{
                        stack.pop();
                        robots[i][1] = 0;
                        break;
                    }
                }
                if (robots[i][1] > 0) {
                    stack.push(robots[i]);
                }
            }
        }
        
        List<Integer> survived = new ArrayList<>();
        int[] result = new int[positions.length];
        Arrays.fill(result, -1);   
        while (!stack.isEmpty()) {
            int[] robot = stack.pop();
            result[robot[2]] = robot[1];
        }  
        for (int i = 0; i < positions.length; i++) {
            if (result[i] > 0) {
                survived.add(result[i]);
            }
        }     
        return survived;
    }
}