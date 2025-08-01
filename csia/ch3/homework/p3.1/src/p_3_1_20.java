public class p_3_1_20 {


    public static void printPotentialGene(String dna, int minSeq)
    {
        // Ends with a stop codon.
        int indexTAA = dna.indexOf("TAA");
        int indexTAG = dna.indexOf("TAG");
        int indexTGA = dna.indexOf("TGA");

        if (indexTAA == -1) indexTAA = Integer.MAX_VALUE;
        if (indexTAG == -1) indexTAG = Integer.MAX_VALUE;
        if (indexTGA == -1) indexTGA = Integer.MAX_VALUE;

        int min = Math.min(Math.min(indexTAA, indexTAG), indexTGA);
        if (min == Integer.MAX_VALUE) return;

        String gen = dna.substring(0, min);
        String end = dna.substring(min, min + 3);

        // Length is a multiple of 3.
        int len = gen.length();
        if ((len % 3 != 0) || (len < minSeq))  return;

        // No intervening stop codons.
        /*for (int i = 0; i < min; i++) {
            if (i % 3 == 0) {
                String codon = dna.substring(i, i+3);
                if (codon.equals("TAA")) return;
                if (codon.equals("TAG")) return;
                if (codon.equals("TGA")) return;
            }
        }*/

        if (gen.contains("TAA") || gen.contains("TAG") ||gen.contains("TGA")) {
            return;
        }

        StdOut.println("ATG" + dna.substring(0, min) + end);
    }

    public static void printAllPotentialGene(String DNA, int minSeq)
    {
        String[] a = DNA.split("ATG");

        for(int i = 1; i < a.length; i++) {

            printPotentialGene(a[i], minSeq);
        }
        //StdOut.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        int minSeq = Integer.parseInt(args[0]);
        printAllPotentialGene("ATGAACTAATAGATGTAGATGAAAGGGCCCTAA", minSeq);
    }
}
