public class Whatsapp3 extends Whatsapp2 {
    public static void main(String[] args) {
        Whatsapp3 w3=new Whatsapp3();
        w3.Texting();;
        w3.AudioCall();
        w3.VideoCall();
        w3.PutStatus();
    }
    void PutStatus()
    {
        System.out.println("Status Updated");
    }
}
