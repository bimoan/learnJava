class array1 {

  public static void main (String[] args){

    int[] nama = new int[4]; //jenis penulisan ke - 1

    nama[0] = 100; nama[1] = 200; nama[2] = 300; //jenis penulisan ke - 1


    int[] nama2 = {100, 200, 300, 400}; //jenis penulisan ke - 2

    // for(int i=0; i<4; i++){
    //
    //   System.out.println(nama2[i]);
    // }

    //System.out.println(nama[0]);

    array1 obj1 = new array1();

    obj1.orang();
  }

  void orang() {

    System.out.println("Berjalan Prok Prok");
  }
}
