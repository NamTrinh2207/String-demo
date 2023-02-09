public class Main {
    public static void main(String[] args) {

        String s="Hello c1122h1";

        //Phương thức toUpperCase() và toLowerCase()
        System.out.println(s.toUpperCase()); // chuyển sang chữ hoa
        System.out.println(s.toLowerCase()); // chuyển sang chữ thường

        //Phương thức trim() cắt khoảng trống 2 đầu
        demo();
        String s1 ="    c1122h1    ";
        System.out.println(s1.trim());

        //Phương thức startsWith() và endsWith()
        demo();
        System.out.println(s.startsWith("He"));
        System.out.println(s.endsWith("h1"));

        //Phương thức charAt() lấy ra ký tự thứ index
        demo();
        System.out.println(s.charAt(0));//H
        System.out.println(s.charAt(6));//c

        //Phương thức length() lấy ra độ dài
        demo();
        System.out.println(s.length());//độ dài =  13

        //Phương thức intern() so sánh sau đó trả về chuỗi sau khi so sánh.
        demo();
        String s2 = s.intern();
        System.out.println(s2);

        //Phương thức valueOf()
        demo();
        int a=10;
        s=String.valueOf(a);
        System.out.println(s+10);

        //Phương thức replace()
        demo();
        String s3="Hello c1122h1";
        String replaceString=s3.replace("Hello","Hola");//thay the "Java" to "Ja"
        System.out.println(replaceString);

        //demo String Builder
        demo();
        demoStringBuilder();


    }
    public static void demo(){
        System.out.println("-------------------");
    }

    public static void demoStringBuilder(){

        StringBuilder demo = new StringBuilder("Hello ");
        // Phương thức append() của lớp StringBuilder nối thêm tham số vào cuối chuỗi.
        demo.append(" c1122h1");
        System.out.println(demo);

        //Phương thức insert() của lớp StringBuilder chèn chuỗi vào chuỗi này từ vị trí quy định.
        demo();
        demo.insert(14, "2");//đến đây chuỗi ban đầu đã bị thay đổi
        System.out.println(demo);//in -> Hello  c1122h12

        //Phương thức replace() của lớp StringBuilder thay thế chuỗi bằng chuỗi khác
        demo();
        demo.replace(1, 3, "Java");
        System.out.println(demo);//in -> HJavalo  c1122h12

        //Phương thức delete() của lớp StringBuilder xóa chuỗi
        demo();
        demo.delete(0, 3);
        System.out.println(demo);//in -> valo  c1122h12

        //Phương thức reverse() của lớp StringBuilder đảo ngược chuỗi hiện tại.
        demo();
        demo.reverse();
        System.out.println(demo);//in -> 21h2211c  olav
    }
}