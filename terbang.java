package latihan.pkg10.pplg.pkg2.Penerbangan;

import java.util.Random;
import java.util.Scanner;

public class terbang {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String nama = "";
       
        System.out.print("Siapa namamu? : ");
        nama = scan.nextLine();
        
        System.out.println("Selamat datang di Aplikasi Booking Pesawat!");
        
        Scanner scan1 = new Scanner(System.in);
       String maskapai = "";
       
        System.out.println("1. Lion Air");
        System.out.println("2. Garuda Indonesia");
        System.out.println("3. Batik Air");
        System.out.print("Pilihlah salah satu maskapai di atas yang anda akan pesan (Tulis dengan menggunakan angka, contoh 1, 2, atau 3) : ");
        maskapai = scan.nextLine();
        
        switch (maskapai) {
            case "1" : 
                System.out.println("Oke, kamu memilih Lion Air");
                System.out.println("Berikut adalah list tempat duduk di Lion Air");
                System.out.println("A1 - A10");
                System.out.println("B1 - B10");
                System.out.println("C1 - C10");
                System.out.println("D1 - D10");
                System.out.println("E1 - E10");
                System.out.println("F1 - F10");
                
                Scanner scan3 = new Scanner(System.in);
                String seat = "";
       
                System.out.print("Seat mana yang akan kamu pilih? : ");
                seat = scan.nextLine();
                
                System.out.println("Oke kamu memilih seat " + seat);
                Random random = new Random();

                // Menghasilkan angka acak dalam rentang 0 hingga 99 (0-99)
                int jendela = random.nextInt(2);
                if (jendela == 1) {
                    System.out.println("Selamat! seat anda ada di sebelah jendela pesawat, jadi kamu bisa melihat pemandangan di luar pesawat!.");
                    Scanner scan8 = new Scanner(System.in);
                    String makansiang = "";
       
                    System.out.print("Ini sudah jam makan malam, apa yang anda ingin kan untuk makan malam ini? (ketik TIDAK MAU jika tidak mau makan malam) : ");
                    makansiang = scan.nextLine();
                    
                    if (makansiang.equals("TIDAK MAU")) {
                        System.out.println("Oke, Silahkan tidur karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Lion Air!");
                        break;
                    } else {
                        System.out.println("Oke kami akan membuat " + makansiang + " dalam 10 menit. Selama menunggu, silahkan nikmati roti dari kami terlebih dahulu.");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Ini " + makansiang + " yang kamu pesan, selamat menikmati " + makansiang + " dari kami!. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Silahkan tidur " + nama + " karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Lion Air!");
                        break;
                    }
                } else {
                    System.out.println("Mohon maaf, seat anda tidak di sebelah jendela pesawat.");
                     Scanner scan9 = new Scanner(System.in);
                    String makansiang = "";
                    System.out.print("Ini sudah jam makan malam, apa yang anda ingin kan untuk makan malam ini? (ketik TIDAK MAU jika tidak mau makan malam) : ");
                    makansiang = scan.nextLine();
                    
                    if (makansiang.equals("TIDAK MAU")) {
                        System.out.println("Oke, Silahkan tidur karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Lion Air!");
                        break;
                    } else {
                        System.out.println("Oke kami akan membuat " + makansiang + " dalam 10 menit. Selama menunggu, silahkan nikmati roti dari kami terlebih dahulu.");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Ini " + makansiang + " yang kamu pesan, selamat menikmati " + makansiang + " dari kami!. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Silahkan tidur " + nama + " karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ", Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Lion Air!");
                        break;
                    }
                }
            case "2" : 
                System.out.println("Oke, kamu memilih Garuda Indonesia");
                System.out.println("Berikut adalah list tempat duduk di Garuda Indonesia");
                System.out.println("A1 - A10");
                System.out.println("B1 - B10");
                System.out.println("C1 - C10");
                System.out.println("D1 - D10");
                System.out.println("E1 - E10");
                System.out.println("F1 - F10");
                
                Scanner scan12 = new Scanner(System.in);
                String seat1 = "";
       
                System.out.print("Seat mana yang akan kamu pilih? : ");
                seat1 = scan.nextLine();
                
                System.out.println("Oke kamu memilih seat " + seat1);
                Random random1 = new Random();

                // Menghasilkan angka acak dalam rentang 0 hingga 99 (0-99)
                int jendela1 = random1.nextInt(2);
                if (jendela1 == 1) {
                    System.out.println("Selamat! seat anda ada di sebelah jendela pesawat, jadi kamu bisa melihat pemandangan di luar pesawat!.");
                    Scanner scan102 = new Scanner(System.in);
                    String makansiang1 = "";
       
                    System.out.print("Ini sudah jam makan malam, apa yang anda ingin kan untuk makan malam ini? (ketik TIDAK MAU jika tidak mau makan malam) : ");
                    makansiang1 = scan.nextLine();
                    
                    if (makansiang1.equals("TIDAK MAU")) {
                        System.out.println("Oke, Silahkan tidur karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Garuda Indonesia");
                        break;
                    } else {
                        System.out.println("Oke kami akan membuat " + makansiang1 + " dalam 10 menit. Selama menunggu, silahkan nikmati roti dari kami terlebih dahulu.");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Ini " + makansiang1 + " yang kamu pesan, selamat menikmati " + makansiang1 + " dari kami!. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Silahkan tidur " + nama + " karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Garuda Indonesia!");
                        break;
                    }
                } else {
                    System.out.println("Mohon maaf, seat anda tidak di sebelah jendela pesawat.");
                     Scanner scan012 = new Scanner(System.in);
                    String makansiang2 = "";
                    System.out.print("Ini sudah jam makan malam, apa yang anda ingin kan untuk makan malam ini? (ketik TIDAK MAU jika tidak mau makan malam) : ");
                    makansiang2 = scan.nextLine();
                    
                    if (makansiang2.equals("TIDAK MAU")) {
                        System.out.println("Oke, Silahkan tidur karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Garuda Indonesia!");
                        break;
                    } else {
                        System.out.println("Oke kami akan membuat " + makansiang2 + " dalam 10 menit. Selama menunggu, silahkan nikmati roti dari kami terlebih dahulu.");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Ini " + makansiang2 + " yang kamu pesan, selamat menikmati " + makansiang2 + " dari kami!. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Silahkan tidur " + nama + " karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ", Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Garuda Indonesia!");
                        break;
                    }
                }
            case "3" : 
                System.out.println("Oke, kamu memilih Batik Air.");
                System.out.println("Berikut adalah list tempat duduk di Batik Air.");
                System.out.println("A1 - A10");
                System.out.println("B1 - B10");
                System.out.println("C1 - C10");
                System.out.println("D1 - D10");
                System.out.println("E1 - E10");
                System.out.println("F1 - F10");
                
                Scanner scan124 = new Scanner(System.in);
                String seat11 = "";
       
                System.out.print("Seat mana yang akan kamu pilih? : ");
                seat1 = scan.nextLine();
                
                System.out.println("Oke kamu memilih seat " + seat1);
                Random random12 = new Random();

                // Menghasilkan angka acak dalam rentang 0 hingga 99 (0-99)
                int jendela12 = random12.nextInt(2);
                if (jendela12 == 1) {
                    System.out.println("Selamat! seat anda ada di sebelah jendela pesawat, jadi kamu bisa melihat pemandangan di luar pesawat!.");
                    Scanner scan1021 = new Scanner(System.in);
                    String makansiang12 = "";
       
                    System.out.print("Ini sudah jam makan malam, apa yang anda ingin kan untuk makan malam ini? (ketik TIDAK MAU jika tidak mau makan malam) : ");
                    makansiang12 = scan.nextLine();
                    
                    if (makansiang12.equals("TIDAK MAU")) {
                        System.out.println("Oke, Silahkan tidur karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Batik Air!");
                        break;
                    } else {
                        System.out.println("Oke kami akan membuat " + makansiang12 + " dalam 10 menit. Selama menunggu, silahkan nikmati roti dari kami terlebih dahulu.");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Ini " + makansiang12 + " yang kamu pesan, selamat menikmati " + makansiang12 + " dari kami!. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Silahkan tidur " + nama + " karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Batik Air!");
                        break;
                    }
                } else {
                    System.out.println("Mohon maaf, seat anda tidak di sebelah jendela pesawat.");
                     Scanner scan0123 = new Scanner(System.in);
                    String makansiang22 = "";
                    System.out.print("Ini sudah jam makan malam, apa yang anda ingin kan untuk makan malam ini? (ketik TIDAK MAU jika tidak mau makan malam) : ");
                    makansiang22 = scan.nextLine();
                    
                    if (makansiang22.equals("TIDAK MAU")) {
                        System.out.println("Oke, Silahkan tidur karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ". Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Batik Air!");
                        break;
                    } else {
                        System.out.println("Oke kami akan membuat " + makansiang22 + " dalam 10 menit. Selama menunggu, silahkan nikmati roti dari kami terlebih dahulu.");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Ini " + makansiang22 + " yang kamu pesan, selamat menikmati " + makansiang22 + " dari kami!. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Silahkan tidur " + nama + " karena ini sudah malam. ");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("5 jam kemudian...");
                        try {
                        // Menambahkan delay 3 detik (3000 milidetik)
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("Bangun " + nama + ", Pesawat sudah sampai di Bandra Tujuan mu. Silahkan kemas barang barang mu dan turun dari pesawat. Terima kasih sudah memakai layanan maskapai Batik Air!");
                        break;
                    }
                }
            }
        }
    }
