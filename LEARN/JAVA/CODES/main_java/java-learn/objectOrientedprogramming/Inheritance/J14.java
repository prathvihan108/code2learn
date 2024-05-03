
    interface Wifi
    {
        void connect();
        void network();

      
    }

    interface Camera
    {
        void snap();
        void aishot();
    }

    class Phone
    {
        void call()
        {
            System.out.println("Calling");

        }

    
    }

    class SmartPhone extends Phone implements Wifi,Camera
    {
        public void connect()
        {
            System.out.println("Connecting");

        }

        public void network()
        {
            System.out.println("Networking");
        }

        public void snap()
        {
            System.out.println("Taking snap");
        }
        public void aishot()
        {
            System.out.println("Taking ai shot");

        }
    }


    //Polymorphism in interfaces
    //
    public class J14 {
    public static void main(String[] args) {

     //   SmartPhone obj1=new Wifi();  Tou cn not create objects of interfaces
        Phone obj2=new SmartPhone();  //this is ok ,super class reference  can store subclass object
      //  SmartPhone obj3=new Phone();  /this is  not ok

      Wifi obj4= new SmartPhone();
      //now in htis case wifi object can only access wifi interface methods not all methods // same applies to object of camera class
     
      obj4.connect();//ok
      obj4.network();//ok


     // obj4.snap(); //not ok
     // obj4.aiShot() ;// not ok
        
    }

    
}

//Learn about access miodifires in java ,present in basics folder
