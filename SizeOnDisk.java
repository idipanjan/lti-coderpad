package coderpad;

public class SizeOnDisk {
    public static int computeSizeOnDisk(int clusterSize, int fileSize) {
        // Calculate the number of clusters required, rounding up
        int clustersRequired = (int) Math.ceil((double) fileSize / clusterSize);

        // Calculate and return the total size on disk (clusters * clusterSize)
        return clustersRequired * clusterSize;
    }

    public static void main(String[] args) {
        int clusterSize = 512;
        int fileSize = 1500;
        System.out.println("Total size on disk: " + computeSizeOnDisk(clusterSize, fileSize));
        // Output: 1024 (file fits exactly in 2 clusters, 512 * 2 = 1024 bytes)
    }
}
