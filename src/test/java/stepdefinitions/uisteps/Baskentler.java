package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;
public class Baskentler {

    Workbook workbook;

    @Given("kullanici dosyayi kullanilabilir hale getirelim")
    public void kullanici_dosyayi_kullanilabilir_hale_getirelim() throws IOException {
       String excelUlkeler= "src/test/resources/ulkeler (1).xlsx";
        FileInputStream fis=new FileInputStream(excelUlkeler);
        workbook= WorkbookFactory.create(fis);
    }

    @Then("- {int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdakiHucreyiYazdirir(int satir, int sutun) {
    String istenenHucre=workbook.getSheet("Sayfa1").getRow(satir-1).getCell(sutun-1).toString();
        System.out.println(satir+".satir"+" "+sutun+".sutun "+istenenHucre);
    }

    @Then("- baskenti Jakarta olan ulke ismini yazdiralim")
    public void baskenti_jakarta_olan_ulke_ismini_yazdiralim() {

      int satirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 0; i <= satirSayisi; i++) {
   if (workbook.getSheet(("Sayfa1")).getRow(i).getCell(1).toString().contains("Jakarta")){

       System.out.println("Baskenti Jakarta olan ulke :"+workbook.getSheet("Sayfa1").getRow(i).getCell(0));
  }
        }

    }



    @Then("- Ulke sayisinin {int} oldugunu test eder")
    public void ulkeSayisininOldugunuTestEder(int ulkeSayisi) {

    int actualulkesayisi=workbook.getSheet("Sayfa1").getLastRowNum();
     Assert.assertEquals(actualulkesayisi,ulkeSayisi);
     Assert.assertTrue(actualulkesayisi==ulkeSayisi);

    }

    @And("- fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fizikiOlarakKullanilanSatirSayisininOldugunuTestEder(int kullanilanSatirSayisi) {
        int actualsatirsayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(actualsatirsayisi==kullanilanSatirSayisi);



    }


}
