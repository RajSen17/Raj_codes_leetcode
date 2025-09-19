import java.util.*;

class Spreadsheet {
    private Map<String, Integer> mpp = new HashMap<>();

    public Spreadsheet(int rows) {
        // rows not used in this version, but can be extended later
    }

    public void setCell(String cell, int value) {
        mpp.put(cell, value);
    }

    public void resetCell(String cell) {
        mpp.put(cell, 0);
    }

    public int getValue(String formula) {
        if (formula == null || formula.length() <= 1) return 0;
        formula = formula.substring(1); // remove '='

        String[] parts = formula.split("\\+"); // split by '+'
        int sum = 0;

        for (String part : parts) {
            part = part.trim();
            if (part.isEmpty()) continue;

            // if it starts with a letter -> cell reference
            if (Character.isUpperCase(part.charAt(0))) {
                sum += mpp.getOrDefault(part, 0);
            } else {
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}
