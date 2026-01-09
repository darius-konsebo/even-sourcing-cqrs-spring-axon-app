package org.example.demoescqrsaxon.events;

public record AccountCreditedEvent(String accountId, double amount) {
}
