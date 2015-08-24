package com.poker.strategy.combination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashSet;

import static com.poker.strategy.combination.CombinationType.BEST_CARD;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Dmitry Shnurenko
 */
@RunWith(MockitoJUnitRunner.class)
public class BestCardTest {

    @Test
    public void typeShouldBeReturned() {
        BestCard bestCard = new BestCard(new HashSet<>());

        assertThat(bestCard.getCombinationType(), equalTo(BEST_CARD));
    }
}