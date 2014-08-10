import groovy.time.TimeCategory
import org.adscale.henry.Create
import org.junit.Before
import org.junit.Test

import static org.adscale.henry.Create.*
import static org.adscale.henry.Create.show

class DslTest {

    Create onlyHereForDebugging = new Create()

    @Test
    public void testName()  {
        create 'account1'
        create 'advertiser'
        create 'publisher'
        create 'cocaColaAccount'
        on 'account1' create 'campaign1'
        on 'campaign1' create 'ad1'
        on 'campaign1' create 'ad2'
        on 'campaign1' setMaxBid 11

        show 'all'
    }

    @Test
    public void on()  {
        create 'account1'
        on 'account1' create 'campaign1'
        on 'campaign1' setMaxBid 11
        show 'account1'
    }

    @Test
    public void createAndModifyCampaign()  {
        create 'account'
        on 'account' create 'campaign1'
        on 'campaign1' setMaxBid 12

    }

    @Test
    public void dates(){
        Number.mixin TimeCategory

        create 'account1'
        on 'account1' create 'campaign1'
        on 'campaign1' create 'ad1'
        on 'ad1' setStartDate 1.week.ago
        on 'ad1' setEndDate 2.weeks.from.now

        show 'ad1'
    }

    @Test
    public void testClock() throws Exception {

        clock 1.week
        show 'clock'
    }

    @Test
    public void isAdRunning() throws Exception {
        create 'account1'
        on 'account1' create 'campaign1'
        on 'campaign1' create 'ad1'

        on 'ad1' setStartDate 1.week.from.now
        on 'ad1' setEndDate 3.week.from.now

        show 'clock'

        show 'ad1'

//        is 'ad1' running
        println 'is running = ' +  Create.is('ad1').getRunning()

        clock 10.days

        println 'is running = ' +  Create.is('ad1').getRunning()

    }

    @Before
    public void before(){
        Number.mixin TimeCategory
        clock 'reset'
    }
}
