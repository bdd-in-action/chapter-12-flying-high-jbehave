package com.bddinaction.chapter12.steps;

import com.bddinaction.chapter12.model.Persona;
import com.bddinaction.chapter12.model.Status;
import static com.bddinaction.chapter12.model.Status.NonMember;

import com.bddinaction.chapter12.steps.thucydides.EmailSteps;
import com.bddinaction.chapter12.steps.thucydides.NewMemberSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class RegistrationScenario {

    @Steps
    NewMemberSteps newMember;

    Persona persona;

    @Given("$persona is not a Frequent Flyer member")
    public void givenANonFrequentFlyerMember(String name) {
        persona = Persona.withName(name);
        persona.setStatus(NonMember);
        persona.save();
    }

    @Given("name is a $status Frequent Flyer member")
    public void givenAFrequentFlyerMemberWithStatus(String name, Status status) {
        persona = Persona.withName(name);
        persona.setStatus(status);
    }

    @When("$name registers for a new account")
    public void whenAUserRegistersForANewAccount(String name) {
        newMember.opensFrequentFlyerSite();
        newMember.choosesToRegister();
        newMember.entersNameAndAddress(persona);
        newMember.submitsApplication();
    }

    @Steps
    EmailSteps email;

    @Then("$name should be sent a confirmation email with her account number")
    public void shouldReceiveConfirmationEmailWithAccountNumber(String name) {
//        List<EmailMessage> emails = email.getEmailsForUser(name);
//        assertThat(emails, containsMessageWithTitle("Welcome to the Flying High Club"));
    }

    @Then("Jane should receive $bonusPoints bonus points")
    public void thenJaneShouldReceiveBonusPoints(int bonusPoints) {
        // PENDING
    }
}
