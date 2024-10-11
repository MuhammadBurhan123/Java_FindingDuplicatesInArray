class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1};
        int[] duplicates = findDuplicates(array);

        for (int num : duplicates) {
            if (num != -1) {
                System.out.println("Duplicate: " + num);
            }
        }
    }

    public static int[] findDuplicates(int[] array) {
        int[] seen = new int[100];
        int[] duplicates = new int[array.length];
        int dupIndex = 0;

        for (int i = 0; i < duplicates.length; i++) {
            duplicates[i] = -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (seen[array[i]] == 1) {
                duplicates[dupIndex++] = array[i];
            }
            seen[array[i]]++;
        }
        return duplicates;
    }
}
