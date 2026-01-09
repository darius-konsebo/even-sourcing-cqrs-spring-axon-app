package org.example.demoescqrsaxon.events;

import org.example.demoescqrsaxon.enums.AccountStatus;

public record AccountCreatedEvent(String accountId, double initialBalance, String currency, AccountStatus accountStatus) {
}
