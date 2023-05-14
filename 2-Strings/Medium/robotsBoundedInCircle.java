// https://leetcode.com/problems/robot-bounded-in-circle/

public class robotsBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int arr[] = { 0, 0 };
        String dir = "N";

        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                if (dir == "N")
                    arr[1]++;
                else if (dir == "S")
                    arr[1]--;
                else if (dir == "E")
                    arr[0]++;
                else
                    arr[0]--;
            } else if (c == 'L') {
                if (dir == "N")
                    dir = "W";
                else if (dir == "S")
                    dir = "E";
                else if (dir == "E")
                    dir = "N";
                else
                    dir = "S";
            } else {
                if (dir == "N")
                    dir = "E";
                else if (dir == "S")
                    dir = "W";
                else if (dir == "E")
                    dir = "S";
                else
                    dir = "N";
            }
        }
        if (arr[0] == 0 && arr[1] == 0)
            return true;

        if (dir == "N")
            return false;
        else
            return true;
    }
}
