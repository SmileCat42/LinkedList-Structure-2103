/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistsports;

/**
 *
 * @author Windows10
 */
public class DataStore {
    public static int n=13;
    static Products START,LAST;
    final int UB=15;
    int LB=0;
    
    public static class Products {
        public int code;
        public String name;
        public int type;
        public float price;
        public String pic;
        Products left;
        Products right;

        public void setAll(int a, String b, int c, float d, String e){
            code = a;
            name = b;
            type = c;
            price = d;
            pic = e;
        }
        static int getN(){
            return n;
        }
        
    }
    

    static {
        // กำหนดข้อมูลตั้งแต่แรก
        Products NEW1= new Products();
        NEW1.setAll(10233,"Adidas sneaker",1,4600,"/sc/sneakerAdi.jpg");
        START=NEW1;
        Products NEW2= new Products();
        NEW2.setAll(10472,"Nike sneaker",1,4200,"/sc/sneakerNike.jpg");
        Products NEW3= new Products();
        NEW3.setAll(10785,"Skecher sneaker",1,2500,"/sc/ske.jpg");
        Products NEW4= new Products();
        NEW4.setAll(20096,"Umbro Glove",2,800,"/sc/ub.jpg");
        Products NEW5= new Products();
        NEW5.setAll(20504,"Nike football shirt",2,1500,"/sc/shirtNike.jpg");
        Products NEW6= new Products();
        NEW6.setAll(30319,"Ping stick golf",3,1300,"/sc/golfstick.jpg");
        Products NEW7= new Products();
        NEW7.setAll(30873,"Anyday golf bag",3,5000,"/sc/golfbag.jpg");
        Products NEW8= new Products();
        NEW8.setAll(40152,"Yonex strike",4,2400,"/sc/yon.png");
        Products NEW9= new Products();
        NEW9.setAll(40197,"Kawasaki strike",4,1700,"/sc/kawa.jpg");
        Products NEW10= new Products();
        NEW10.setAll(40601,"Victor shuttlecock",4,200,"/sc/shuttle.jpg");
        Products NEW11= new Products();
        NEW11.setAll(50290,"Puma football",5,800,"/sc/puma.jpg");
        Products NEW12= new Products();
        NEW12.setAll(50475,"Mikasa volleyball",5,1200,"/sc/volley.jpg");
        Products NEW13= new Products();
        NEW13.setAll(50778,"Wilson basketball",5,1500,"/sc/wilson.jpg");
        LAST=NEW13;
        
        NEW1.left=null;NEW1.right=NEW2;
        NEW2.left=NEW1;NEW2.right=NEW3;
        NEW3.left=NEW2;NEW3.right=NEW4;
        NEW4.left=NEW3;NEW4.right=NEW5;
        NEW5.left=NEW4;NEW5.right=NEW6;
        NEW6.left=NEW5;NEW6.right=NEW7;
        NEW7.left=NEW6;NEW7.right=NEW8;
        NEW8.left=NEW7;NEW8.right=NEW9;
        NEW9.left=NEW8;NEW9.right=NEW10;
        NEW10.left=NEW9;NEW10.right=NEW11;
        NEW11.left=NEW10;NEW11.right=NEW12;
        NEW12.left=NEW11;NEW12.right=NEW13;
        NEW13.left=NEW12;NEW13.right=null;
    }
}
