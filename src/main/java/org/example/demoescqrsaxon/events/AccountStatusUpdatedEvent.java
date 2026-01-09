package org.example.demoescqrsaxon.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.demoescqrsaxon.enums.AccountStatus;
@Getter @AllArgsConstructor
public class AccountStatusUpdatedEvent {
    String accountId;
    AccountStatus accountStatus;
}
