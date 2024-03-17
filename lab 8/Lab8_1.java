public class Lab8_1 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly two integer arguments (x and y).");
            }

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (y < 0) {
                throw new IllegalArgumentException("Exponent (y) must be a non-negative integer.");
            }

            long result = computePower(x, y);
            System.out.println(x + "^" + y + " = " + result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please provide valid integer values for x and y.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static long computePower(int x, int y) {
        long result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}