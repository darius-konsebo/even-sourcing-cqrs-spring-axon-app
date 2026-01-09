package org.example.demoescqrsaxon.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AccountDebitedEvent {
    String accountId;
    double amout;
    String currency;
}
