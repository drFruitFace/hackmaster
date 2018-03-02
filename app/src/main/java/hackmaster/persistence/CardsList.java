package hackmaster.persistence;

import java.util.ArrayList;

import hackmaster.objects.CardClass;
import hackmaster.objects.CardResource;
import hackmaster.objects.ResourceClass;

/**
 * Created by Owner on 1/29/2018.
 */

public class
CardsList {
    // health, hCoin, hCoinRate, botnet, botnetRate, cpu, cpuRate
    //
    public static CardClass[] presetCards() {
        // make some cards where you set all the specs
        int count = 0;
        ArrayList<CardClass> cards = new ArrayList<CardClass>(20);

        // TO DO make a list of cards

        CardClass tempCard = new CardClass(0, "CPU Boost", "Upgrade", "Upgrade your CPU",
                new CardResource(new ResourceClass(0, -1, 0, 0, 0,1, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(1, "More Cores", "Defense", "Upgrade your CPU",
                new CardResource(new ResourceClass(0, -2, 2, 0, 0,0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(2, "bot.net", "Upgrade", "Upgrade your CPU",
                new CardResource(new ResourceClass(0, -2, 2, -2, 0,0, 1), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(3, "cut some wires", "Defense", "Upgrade your CPU",
                new CardResource(new ResourceClass(0, 0, 0, -1, 0,0, 0), new ResourceClass(-1, 0, 0, 0, 0,0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(4, "Upgrade Botnet", "Upgrade", "Increase Botnet Rate",
                new CardResource(new ResourceClass(0, -2, 0, 0, 0, 0, 2), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(5, "Upgrade CPU", "Upgrade", "Increase CPU Calculations",
                new CardResource(new ResourceClass(0, -2, 0, 0, 0, 2, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(6, "Upgrade Hash Rate", "Upgrade", "Increase Cryptocurrency Mining Rate",
                new CardResource(new ResourceClass(0, -2, 0, +1, 0, 0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(7, "DDOS", "Attack", "Deals a Decent Amount of Damage to the Enemy",
                new CardResource(new ResourceClass(0, 0, 0, -2, 0, 0, 0), new ResourceClass(-2, 0, 0, 0, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(8, "File Transfer", "Attack", "Steal Enemy Resources",
                new CardResource(new ResourceClass(0, 1, 1, -2, 0, 0, 0), new ResourceClass(-1, -1, -1, -2, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(9, "Pop-up", "Attack", "Deals a Small Amount of Damage to the Enemy",
                new CardResource(new ResourceClass(0, 0, 0, -1, 0, 0, 0), new ResourceClass(-1, 0, 0, 0, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(10, "Anti-Virus", "Defence", "Gain a Small Amount of Health",
                new CardResource(new ResourceClass(0, 0, -2, 0, 0, 0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(11, "Firewall", "Defence", "Gain a Decent Amount of Health",
                new CardResource(new ResourceClass(2, 0, -2, 0, 0, 0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(12, "Play the Market", "Upgrade", "Spend 4 Cryptocoins Gain 8 Back",
                new CardResource(new ResourceClass(0, 2, 0, 0, 0, 0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(13, "Overclock", "Upgrade", "Spend 4 Cryptocoins to Gain 40 Processing Power",
                new CardResource(new ResourceClass(0, -2, 2, 0, 0, 0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(14, "Server Farm", "Upgrade", "Spend 4 Cryptocoins gain 400 Botnets",
                new CardResource(new ResourceClass(0, -2, 2, 0, 0, 0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(15, "Expand", "Upgrade", "Increase the Rate of All Resources",
                new CardResource(new ResourceClass(0, -3, 0, 0, 1, 1, 1), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(16, "Market Crash", "Upgrade", "Enemy Loses 20 Cryptocoins",
                new CardResource(new ResourceClass(0, -3, 0, 0, 0, 0, 0), new ResourceClass(0, -3, 0, 0, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(17, "Network Outage", "Upgrade", "Enemy Loses 450 Botnets",
                new CardResource(new ResourceClass(0, -3, 0, 0, 0, 0, 0), new ResourceClass(0, 0, 0, -3, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(18, "Throttle", "Upgrade", "Enemy Loses 20 Processing Power",
                new CardResource(new ResourceClass(0, -3, 0, 0, 0, 0, 0), new ResourceClass(0, 0, -3, 0, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(19, "Hack!!", "Attack", "Deal a Small Amount of Damage to the Enemy",
                new CardResource(new ResourceClass(0, -2, 0, 0, 0, 0, 0), new ResourceClass(-2, 0, 0, 0, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(20, "Debug", "Attack", "Gain a Small Amount of Health",
                new CardResource(new ResourceClass(1, -2, 0, 0, 0, 0, 0), null));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(21, "Exploit", "Attack", "Gain a Small Amount of Health and Deal Damage to the Enemy",
                new CardResource(new ResourceClass(1, -2, 0, 0, 0, 0, 0), new ResourceClass(-2, 0, 0, 0, 0, 0, 0)));
        cards.add(tempCard);
        count++;

        tempCard = new CardClass(22, "Zero Day", "Attack", "Deal a Large Amount of Damage to the Enemy While Also Taking Away Resources",
                new CardResource(new ResourceClass(0, -3, 0, 0, 0, 0, 0), new ResourceClass(-3, 0, 0, 0, -2, -2, -2)));
        cards.add(tempCard);

        tempCard = new CardClass(23, "Attack+", "Attack", "Deal a Decent Amount of Damage to the Enemy",
                new CardResource(new ResourceClass(0, -1, 0, 0, 0, 0, 0), new ResourceClass(-2, 0, 0, 0, 0, 0, 0)));
        cards.add(tempCard);

        tempCard = new CardClass(24, "Attack++", "Attack", "Deal a Decent Amount of Damage to the Enemy",
                new CardResource(new ResourceClass(0, -2, 0, 0, 0, 0, 0), new ResourceClass(-3, 0, 0, 0, 0, 0, 0)));
        cards.add(tempCard);

        tempCard = new CardClass(25, "Attack#", "Attack", "Deal a Decent Amount of Damage to the Enemy",
                new CardResource(new ResourceClass(0, -3, 0, 0, 0, 0, 0), new ResourceClass(-4, 0, 0, 0, 0, 0, 0)));
        cards.add(tempCard);

        return cards.toArray(new CardClass[0]);
    }
}