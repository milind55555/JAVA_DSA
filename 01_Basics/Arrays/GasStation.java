public class GasStation {
    public static void main(String[] args) {
        int[] gas={1,2,3,4};
        int[] cost ={2,4,5,7};
        System.out.println(canCompleteCircuit(gas, cost));
    }
     public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            totalGas += balance;
            tank += balance;

            if (tank < 0) {
                // Cannot travel from this start to i+1
                start = i + 1;
                tank = 0;
            }
        }

        return totalGas >= 0 ? start : -1;
    }
}
