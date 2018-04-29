// UNTUK MEMAHAMI CLASS & OBJEK

  public class smartphone {

    int Pulsa;
    int SignalLvl;
    int BateryLvl;
    boolean GraphiCard;
    boolean Data;
    boolean Gps;
    boolean Camera;



    public static void main (String []args){

      smartphone infinix = new smartphone();

      infinix.Pulsa = 10000;
      infinix.SignalLvl = 50;
      infinix.BateryLvl = 100;
      infinix.GraphiCard = false;
      infinix.Data = true;
      infinix.Gps = true;
      infinix.Camera = true;

      infinix.Calling();


    }

    void Calling(){

      if(Pulsa > 1000 || SignalLvl > 0 || BateryLvl > 0){
        System.out.println("Sedang Melakukan Panggilan");
      }else{
        System.out.println("Maaf, Tidak bisa melakukan Panggilan");
      }

    }

    void UseMpas(){

      if(Data == true || Gps == true || SignalLvl > 0 || BateryLvl > 0 ){
        System.out.println("Sedang Menggunakan Maps");
      }else{
        System.out.println("Maaf, Tidak bisa menggunakan Maps");
      }

    }

    void Browsing(){

      if(Data == true || SignalLvl > 0 || BateryLvl > 0){
        System.out.println("Sedang Browsing");
      }else{
        System.out.println("Maaf, Tidak bisa melakukan Browsing");
      }
    }

    void Gaming(){

      if(GraphiCard == true || BateryLvl > 0){
        System.out.println("Sedang Bermain Game");
      }else{
        System.out.println("Maaf, Tidak Bisa Bermain Game");
      }

    }

    void VideoCall(){

      if(Data == true || Camera == true || SignalLvl > 0 || BateryLvl > 0){
        System.out.println("Sedang Video Calling");
      }else{
        System.out.println("Maaf, Tidak bisa video calling");
      }
    }

    void TakePicture(){
      if(Camera == true || BateryLvl > 0){
        System.out.println("Sedang Mengambil Gambar");
      }else{
        System.out.println("Maaf, Tidak bisa mengambil gambar");
      }
    }


  }
