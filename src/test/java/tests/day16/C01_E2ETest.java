package tests.day16;

import org.testng.annotations.Test;
import pages.QAConcortPage;

public class C01_E2ETest {
    @Test
    public void test(){
//        3. https://qa-environment.concorthotel.com/ adresine gidin.
//        4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
//        a. Username : manager  b. Password  : Manager1!
//                5. Login butonuna tıklayın.
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
//        6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        
//        7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
//        8. Save butonuna basin.
//        9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
//        10. OK butonuna tıklayın.
//        11. Hotel rooms linkine tıklayın.
//        12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..


    }
}
