package org.example.demoescqrsaxon.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.demoescqrsaxon.enums.AccountStatus;

@Getter @AllArgsConstructor
public class AccountActivatedEvent {
    String accountId;
    AccountStatus accountStatus;
}
