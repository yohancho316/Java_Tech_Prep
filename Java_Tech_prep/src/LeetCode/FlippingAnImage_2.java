package LeetCode;

public class FlippingAnImage_2 {

    public static int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;

            while(left <= right) {

                // Flip the Matrix
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                // Invert the Matrix
                if(image[i][left] == 1) {
                    image[i][left] = 0;
                } else {
                    image[i][left] = 1;
                }

                if(left == right) {
                    break;
                }

                if(image[i][right] == 1) {
                    image[i][right] = 0;
                } else {
                    image[i][right] = 1;
                }

                ++left;
                --right;
            }
        }

        return image;
    }

    public static void main(String[] args) {

        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};

        System.out.println("Pre Fipped & Inverted Matrix:");
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j <image[i].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }

        image = flipAndInvertImage(image);

        System.out.println("Post Flipped & Inverted Matrix:");
        for(int k = 0; k < image.length; k++) {
            for(int l = 0; l <image[k].length; l++) {
                System.out.print(image[k][l]);
            }
            System.out.println();
        }

    }
}
