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
}
