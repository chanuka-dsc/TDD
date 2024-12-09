package org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Dealer {

    @Test
    void testDealerInitialisation() {
        Dealer dealer = new Dealer();

        // dealer should have an empty hand at the begining
        assertTrue(dealer.getHand().isEmpty());
    }
    
}
