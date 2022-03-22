package LeetCode;

public class FlippingAnImage_1 {

    public static int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            while(left <= right) {

                // Flip the Binary Elements
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                // Invert the Binary Elements
                if((left == right) && (image[i][left] == 0)) {
                    image[i][left] = 1;
                    ++left; --right;
                    continue;
                } else if((left == right) && (image[i][left] == 1)) {
                    image[i][left] = 0;
                    ++left; --right;
                    continue;
                }

                if(image[i][left] == 0) {
                    image[i][left] = 1;
                } else if(image[i][left] == 1){
                    image[i][left] = 0;
                }

                if(image[i][right] == 0) {
                    image[i][right] = 1;
                } else if(image[i][right] == 1){
                    image[i][right] = 0;
                }

                // Increment & Decrement the Left / Right Pointers
                ++left;
                --right;
            }
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] example = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i = 0; i < example.length; i++) {
            for(int j = 0; j < example[i].length; j++) {
                System.out.print("[" + i + "][" + example[i][j] + "]\t");
            }
            System.out.println();
        }

        System.out.println("\n\n");


        int[][] image = {{0,0,0,1,1,1}, {1,1,1,0,0,0}, {1,0,1,0,1,0}, {0,1,0,1,0,1}};
        System.out.println("Pre Flipped & Inverted:");
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\n");
        image = flipAndInvertImage(image);


        System.out.println("Post Flipped & Inverted:");
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
    }
}
