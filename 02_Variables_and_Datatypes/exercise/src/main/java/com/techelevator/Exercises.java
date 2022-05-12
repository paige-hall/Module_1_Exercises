package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println("There are " + birdsRemaining + " birds left on the branch.");

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println("There are " + numberOfExtraBirds + " more birds than there are nests.");

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int playingRaccoons = 3;
		int raccoonsEatingDinner = 2;
		int raccoonsInWoods = playingRaccoons - raccoonsEatingDinner;
		System.out.println("There is " + raccoonsInWoods + " raccoon left in the woods.");

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int flowersMoreThanBees = flowers - bees;
		System.out.println("There are " + flowersMoreThanBees + " less bees than there are flowers.");

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int friendlyPigeon = 1;
		int totalPigeons = lonelyPigeon + friendlyPigeon;
		System.out.println(totalPigeons + " pigeons are eating breadcrumbs now.");

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsJoining = 2;
		int totalOwls = owlsOnFence + owlsJoining;
		System.out.println("There are " + totalOwls + " owls sitting on the fence.");

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavers = 2;
		int swimmingBeavers = 1;
		int beaversStillWorking = workingBeavers - swimmingBeavers;
		System.out.println(beaversStillWorking + " beaver is working on the home.");

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansOnTree = 2;
		int joiningToucans = 1;
		int totalToucans = toucansOnTree + joiningToucans;
		System.out.println("In total there are " + totalToucans + " toucans on the tree.");

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsMoreThanNuts = squirrels - nuts;
		System.out.println("There are " + squirrelsMoreThanNuts + " more squirrels than nuts.");

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		final double quarter = 0.25;
		final double dime = 0.10;
		final double nickel = 0.05;
		double nickelTotal = nickel * 2;
		double mrsHiltsChange = quarter + dime + nickelTotal;
		System.out.println("Mrs. Hilt found $" + mrsHiltsChange );

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersClassMuffins = 18;
		int macAdamsClassMuffins = 20;
		int flannerysClassMuffins = 17;
		int totalMuffins = briersClassMuffins + macAdamsClassMuffins + flannerysClassMuffins;
		System.out.println("The first grade class made " + totalMuffins + " muffins.");

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = 0.24;
		double whistle = 0.14;
		double totalCost = yoyo + whistle;
		System.out.println("Mrs. Hilt spent $" + totalCost);

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallowAmount = 8;
		int miniMarshmallowAmount = 10;
		int totalMarshmallows = largeMarshmallowAmount + miniMarshmallowAmount;
		System.out.println(totalMarshmallows + " marshmallows were used.");

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtMrsHiltsHouse = 29;
		int snowAtBrecknockElementary = 17;
		int amountMoreSnow = snowAtMrsHiltsHouse - snowAtBrecknockElementary;
		System.out.println("Mrs. Hilt's house had " + amountMoreSnow + " more inches of snow than the elementary school. ");

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double totalMoney = 10.0;
		double truck = 3.0;
		double pencilCase = 2.0;
		double totalCostAtStore = truck + pencilCase;
		double moneyLeftOver = totalMoney - totalCostAtStore;
		System.out.println("Mrs. Hilt has $" + moneyLeftOver + " left. ");

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int allMarbles = 16;
		int lostMarbles = 7;
		int newMarbleAmount = allMarbles - lostMarbles;
		System.out.println("Josh has " + newMarbleAmount + " marbles left.");

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int megansSeashells = 19;
		int amountMeganWants = 25;
		int amountMeganNeedsToFind = amountMeganWants - megansSeashells;
		System.out.println("Megan needs to find " + amountMeganNeedsToFind + " more seashells.");

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int redBalloons = 8;
		int totalBalloons = 17;
		int greenBalloons = totalBalloons - redBalloons;
		System.out.println("Brad has " + greenBalloons + " green balloons.");

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int addedBooks = 10;
		int totalBooks = booksOnShelf + addedBooks;
		System.out.println("Marta now has " + totalBooks + " books on the shelf.");

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int amountOfLegs = beeLegs * 8;
		System.out.println("8 bees have " + amountOfLegs + " legs.");

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamConePrice = 0.99;
		double twoCones = iceCreamConePrice * 2;
		System.out.println("Two ice cream cones costs $" + twoCones);

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int currentAmountOfRocks = 64;
		int rocksNeededForCompletion = 125;
		int rocksNeeded = rocksNeededForCompletion - currentAmountOfRocks;
		System.out.println("Mrs. Hilt needs " + rocksNeeded + " more rocks to complete the border.");

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int totalMarbles = 38;
		int missingMarbles = 15;
		int marblesLeft = totalMarbles - missingMarbles;
		System.out.println("Mrs. Hilt has " + marblesLeft + " marbles left.");

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToDriveTotal = 78;
		int milesBeforeGas = 32;
		int milesLeftToDrive = milesToDriveTotal - milesBeforeGas;
		System.out.println("Mrs. Hilt and her sister still need to drive " + milesLeftToDrive + " miles.");

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		final int hour = 60;
		int mrsHiltsTimeMorning = hour + 30;
		int mrsHiltsTimeAfternoon = 45;
		int totalTime = mrsHiltsTimeMorning + mrsHiltsTimeAfternoon;
		System.out.println("Mrs. Hilt spent " + totalTime + " minutes shoveling on Saturday.");

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		final double hotdog = 0.50;
		int hotdogsPurchased = 6;
		double costOfHotdogs = hotdog * hotdogsPurchased;
		System.out.println("Mrs. Hilt paid " + costOfHotdogs + " dollars for 6 hotdogs.");

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltsMoney = 50;
		int pencilPrice = 7;
		int pencilsAbleToBePurchased = hiltsMoney / pencilPrice;
		System.out.println("Mrs. Hilt can buy " + pencilsAbleToBePurchased + " pencils with $0.50.");

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int redButterflies = 20;
		int orangeButterflies = totalButterflies - redButterflies;
		System.out.println(orangeButterflies + " of the butterflies are orange.");

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double katesPayment = 1.0;
		double candyCost = 0.54;
		double katesChange = katesPayment - candyCost;
		System.out.println("Kate will get $" + katesChange + " back.");

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int marksTrees = 13;
		int treesToBePlanted = 12;
		int totalTrees = marksTrees + treesToBePlanted;
		System.out.println("Mark will have " + totalTrees + " trees total.");

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int dayInHours = 24;
		int totalHours= dayInHours * 2;
		System.out.println("Joy will see her grandma in " + totalHours + " hours.");

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		int kimsGum = 5;
		int totalGum = 4 * 5;
		System.out.println("Kim will need " + totalGum + " pieces of gum.");

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dansMoney = 3.0;
		double candyBar = 1.0;
		double moneyLeft = dansMoney - candyBar;
		System.out.println("Dan will have $" + moneyLeft + " dollars left.");

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleInBoats = 3;
		int peopleInLake = boatsInLake * peopleInBoats;
		System.out.println("There are " + peopleInLake + " people in the lake.");

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		int lostLegos = 57;
		int legosLeft = ellensLegos - lostLegos;
		System.out.println("Ellen has " + legosLeft + " legos left.");

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsArthurWantsToBake = 83;
		int bakedMuffins = 35;
		int muffinsLeftToMake = 83 - 35;
		System.out.println("Arthur has to bake " + muffinsLeftToMake + " more muffins.");

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int moreThanLucy = 1400 - 290;
		System.out.println("Willy has " + moreThanLucy + " more crayons than Lucy.");

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersOnPage * pagesOfStickers;
		System.out.println("There are " + totalStickers + " stickers in total.");

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100.00;
		double children = 8.0;
		double totalCupcakes = cupcakes / children;
		System.out.println("Each child will get " + totalCupcakes + " cupcakes.");

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int cookiesInJar = 6;
		int cookiesNotInJar = gingerbreadCookies % cookiesInJar;
		System.out.println("There will be " + cookiesInJar + " cookies not placed in jars.");

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int leftoverCroissants = croissants % neighbors;
		System.out.println(leftoverCroissants + " croissants will be leftover.");

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnTray = 12;
		int cookiesNeeded = 276;
		int traysNeeded = cookiesNeeded / cookiesOnTray;
		System.out.println("She will need " + traysNeeded + " trays.");

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
		int servingSize = 12;
		int servings = pretzels / servingSize;
		System.out.println("There are " + servings + " servings of pretzels.");

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int cupcakesAtHome = 2;
		int cupcakesLeftToGive = lemonCupcakes - 2;
		int cupcakePacks = 52 / 3;
		System.out.println(cupcakePacks + " boxes with 3 lemon cupcakes were given away.");


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksTotal = 74;
		int peopleEatingCarrots = 12;
		int carrotsLeft = carrotSticksTotal % peopleEatingCarrots;
		System.out.println("There are " + carrotsLeft + " carrots left over.");


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int sistersTeddyBears = 98;
		int shelvesCapacity = 7;
		int shelvesFilled = sistersTeddyBears / shelvesCapacity;
		System.out.println(shelvesFilled + " shelves will be filled. ");


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumPictures = 20;
		int picturesTotal = 480;
		int albumsNeeded = picturesTotal / albumPictures;
		System.out.println("She will need " + albumsNeeded + " albums for her photos.");


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCardsTotal = 94;
		int boxCanHold = 8;
		int boxesFilled = tradingCardsTotal / boxCanHold;
		int unfilledBox = tradingCardsTotal % boxCanHold;
		System.out.println("There are " + boxesFilled + " boxes filled and " + unfilledBox + " cards in the unfilled box.");


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksTotal = 210;
		int shelves = 10;
		int booksOnEachShelf = booksTotal / shelves;
		System.out.println("There will be " + booksOnEachShelf + " books on each shelf.");


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double croissantsTotal = 17.0;
		double guests = 7.0;
		double eachGuestWillGet = croissantsTotal / guests;
		System.out.println("Each guest will get " + eachGuestWillGet + " croissants.");


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billTime = 2.15;
		double jillTime = 1.90;
		double billRate = 1 / billTime;
		double jillRate = 1 / jillTime;
		double combinedRate = billRate + jillRate;
		double timeToPaint = 5 / combinedRate;
		System.out.println("It will take Bill and Jill " + timeToPaint + " hours to paint 5 rooms.");

		/* Exercise 52
		52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace ";
		String middleInitial = "B.";
		String lastName = "Hopper, ";
		String fullName = lastName + firstName + middleInitial;
		System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceBetweenNewYorkAndChicago = 800.0;
		double distanceTraveled = 537.0;
		double percentComplete = (distanceTraveled / distanceBetweenNewYorkAndChicago) * 100;
		int finalPercentage = (int)percentComplete;
		System.out.println(finalPercentage + " percent of the trip has been completed.");
	}

}
