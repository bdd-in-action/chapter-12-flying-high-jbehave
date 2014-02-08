package com.bddinaction.chapter12.steps.thucydides;

import com.bddinaction.chapter12.model.Persona;
import net.thucydides.core.annotations.Step;

public class NewMemberSteps  {
//    public NewMemberSteps(Pages pages) {
//        super(pages);
//    }

    //HomePage homePage;

    @Step
    public void choosesToRegister() {
        //homePage.selectMenuOptions("Frequent Flyers","Register Online");
    }


    @Step
    public void entersNameAndAddress(Persona persona) {
//        homePage.enterFirstName(persona.getFirstName());
//        homePage.enterLastName(persona.getLastName());
//        homePage.enterAddress(persona.getAddress());
    }


    @Step
    public void opensFrequentFlyerSite() {
//        homePage.open();
    }

    @Step
    public void submitsApplication() {
    }
}

