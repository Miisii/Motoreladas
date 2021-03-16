package hu.idomsoft.divizio2.motoreladas;

import io.cucumber.java.hu.Akkor;
import io.cucumber.java.hu.Amennyiben;
import io.cucumber.java.hu.Ha;

public class CucumberStepDef {
    @Amennyiben("megrendelés érkezett egy motorra")
    public void megrendelésÉrkezettEgyMotorra() {
    }
    @Ha("az előleg ki lett fizetve")
    public void azElőlegKiLettFizetve() {
    }
    @Akkor("a motort meg lehet rendelni a gyártól")
    public void aMotortMegLehetRendelniAGyártól() {
    }
    @Ha("megkapta a banktól az elbírált hitelt")
    public void megkaptaABanktólAzElbíráltHitelt() {
    }
    @Akkor("a beszámítandó motor értéke levonásra kerül a teljes vételárból")
    public void aBeszámítandóMotorÉrtékeLevonásraKerülATeljesVételárból() {
    }
    @Akkor("a beszámítandó autó értéke levonásra kerül a teljes vételárból")
    public void aBeszámítandóAutóÉrtékeLevonásraKerülATeljesVételárból() {
    }
    @Amennyiben("top case-t vásárló a vevő")
    public void topCaseTVásárlóAVevő() {
    }
    @Akkor("meg kell vennie hozzá, a tartó konzolt, és a felszerelő kittet")
    public void megKellVennieHozzáATartóKonzoltÉsAFelszerelőKittet() {
    }
    @Ha("fel is akarja szereltetni")
    public void felIsAkarjaSzereltetni() {
    }
    @Akkor("{double} óra munkaköltség, és {double} óra rezsiköltséget kell felszámolni")
    public void óraMunkaköltségÉsÓraRezsiköltségetKellFelszámolni(Double double1, Double double2) {
    }
    @Amennyiben("oldaldobozokat vásáról a vevő")
    public void oldaldobozokatVásárólAVevő() {
    }
    @Amennyiben("középsztenderdet vásáról a vevő")
    public void középsztenderdetVásárólAVevő() {
    }
    @Amennyiben("markolatfűtés vásáról a vevő")
    public void markolatfűtésVásárólAVevő() {
    }
    @Akkor("meg kell vennie hozzá, a kábelszettet, és {int} kapcsoló relét")
    public void megKellVennieHozzáAKábelszettetÉsKapcsolóRelét(Integer int1) {
    }
    @Amennyiben("túraplexit vásáról a vevő")
    public void túraplexitVásárólAVevő() {
    }
    @Akkor("meg kell vennie hozzá, a felszerelő kittet")
    public void megKellVennieHozzáAFelszerelőKittet() {
    }
    @Akkor("fél óra munkaköltség, és fél óra rezsiköltséget kell felszámolni")
    public void félÓraMunkaköltségÉsFélÓraRezsiköltségetKellFelszámolni() {
    }
    @Akkor("háromnegyed óra munkaköltség, és háromnegyed óra rezsiköltséget kell felszámolni")
    public void háromnegyedÓraMunkaköltségÉsHáromnegyedÓraRezsiköltségetKellFelszámolni() {
    }
    @Akkor("kettő óra munkaköltség, és kettő óra rezsiköltséget kell felszámolni")
    public void kettőÓraMunkaköltségÉsKettőÓraRezsiköltségetKellFelszámolni() {
    }
}
