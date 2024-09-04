class Solution {
    public static int robotSim(int[] commands, int[][] obstacles) {
        
        int x = 0;
        int y = 0;
        int maxDistance = 0;
        String direction = "north";
        
        for(int command : commands) {
            if(command > 0 && command < 10){
                if(direction.equals("north")){
                    int newY = y + command;
                    for(int[] obstacle : obstacles){
                        if(obstacle[0] == x && obstacle[1] > y && obstacle[1] <= newY){
                            newY = obstacle[1] - 1;
                        }
                    }
                    y = newY;
                }
                else if(direction.equals("east")){
                    int newX = x + command;
                    for(int[] obstacle : obstacles){
                        if(obstacle[1] == y && obstacle[0] > x && obstacle[0] <= newX){
                            newX = obstacle[0] - 1;
                        }
                    }
                    x = newX;
                }
                else if(direction.equals("south")){
                    int newY = y - command;
                    for(int[] obstacle : obstacles){
                        if(obstacle[0] == x && obstacle[1] < y && obstacle[1] >= newY){
                            newY = obstacle[1] + 1;
                        }
                    }
                    y = newY;
                }
                else if(direction.equals("west")){
                    int newX = x - command;
                    for(int[] obstacle : obstacles){
                        if(obstacle[1] == y && obstacle[0] < x && obstacle[0] >= newX){
                            newX = obstacle[0] + 1;
                        }
                    }
                    x = newX;
                }
            }
            
            else if(command == -1) {
                if(direction.equals("north")) direction = "east";
                else if(direction.equals("east")) direction = "south";
                else if(direction.equals("south")) direction = "west";
                else if(direction.equals("west")) direction = "north";
            }
            
            else if(command == -2) {
                if(direction.equals("north")) direction = "west";
                else if(direction.equals("east")) direction = "north";
                else if(direction.equals("south")) direction = "east";
                else if(direction.equals("west")) direction = "south";
            }
            
            maxDistance = Math.max(maxDistance, x*x + y*y);
                
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println();
        }
        return maxDistance;
    }
}
