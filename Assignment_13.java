

public class Assignment_13 {
    static void solidRectangle(){
        System.out.println("\nSolid Rectangle");
        for(int i=0;i<=4;i++){
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void leftBottomAngle(){
        System.out.println("Left Bottom Right Angled Triangle Pattern");
        for(int i=0;i<=4;i++){
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void leftTopAngle(){
        System.out.println("Left Top Right Angled Triangle Pattern");
        for(int i=0;i<=4;i++){
            for (int j = 5; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void rightBottomAngle(){
        System.out.println("Right Bottom Right Angled Triangle Pattern");
        for(int i=0;i<=4;i++){
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    
    static void rightTopAngle(){
        System.out.println("Right Top Right Angled Triangle Pattern");
        for(int i=0;i<=4;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 4; k >=i; k--) {
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRectangle();
        leftBottomAngle();
        leftTopAngle();
        rightBottomAngle();
        rightTopAngle();
    }
}
