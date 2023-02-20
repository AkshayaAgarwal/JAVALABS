class box {
    double width;
    double height;
    double depth;
    void volume(){
        System.out.println("Volume is");
        System.out.println(width*height*depth);
    }
    public class boxdemo3
    {
        public static void main(String[] args)
        {
            box mybox1=new box();
            box mybox2=new box();
            mybox1.width=10;
            mybox1.height=20;
            mybox1.depth=15;
            mybox1.volume();

            mybox2.width=1;
            mybox2.height=2;
            mybox2.depth=5;
            mybox2.volume();

        }
    }
    }
