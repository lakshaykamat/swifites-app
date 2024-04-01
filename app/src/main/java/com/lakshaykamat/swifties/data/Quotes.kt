package com.lakshaykamat.swifties.data

import com.lakshaykamat.swifties.models.Quote

object Quotes {
    private val quotes = listOf(
        Quote(
            quote = "When you think Tim McGraw, I hope you think of me.",
            album = "Taylor Swift",
            song = "Tim McGraw",
        ),
        Quote(
            quote = "I don't know how to be something you miss.",
            album = "Speak Now",
            song = "Last Kiss",
        ),
        Quote(
            quote = "Why are people always leaving? I think you and I should stay the same.",
            album = "Fearless",
            song = "Hey Stephen",
        ),
        Quote(
            quote = "These walls that they put up to hold us back will fall down…",
            album = "Fearless",
            song = "Change",
        ),
        Quote(
            quote = "Bring on all the pretenders. One day, we will be remembered.",
            album = "Speak Now",
            song = "Long Live",
        ),
        Quote(
            quote = "Love's a game, wanna play?",
            album = "1989",
            song = "Blank Space",
        ),
        Quote(
            quote = "I think I've seen this film before \n And I didn't like the ending \nYou're not my homeland anymore \nSo what am I defending now?",
            album = "Folklore",
            song = "Exile",
        ),
        Quote(
            quote = "I know where it all where wrong, your favorite song was playing from the far side of the gym \nI was nowhere to be found I hate the crowds \n Plus I saw you dance with him",
            album = "Folklore",
            song = "Betty",
        ),
        Quote(
            quote = "I bury hatchets, but I keep maps of where I put 'em",
            album = "Reputation",
            song = "End Game",
        ),
        Quote(
            quote = "I don't wanna keep secrets just to keep you",
            album = "Lover",
            song = "Cruel Summer",
        ),
        Quote(
            quote = "They say home is where the heart is, but that's not where mine lives",
            album = "Lover",
            song = "London Boy",
        ),
        Quote(
            quote = "I replay my footsteps on each stepping stone, trying to find the one where I went wrong",
            album = "Evermore",
            song = "Evermore",
        ),
        Quote(
            quote = "A relaxing thought \n Aren't you envious that for you it's not?",
            album = "Midnights",
            song = "Karma",
        ),
        Quote(
            quote = "I spy with my little tired eye \n Tiny as a firefly \n A pebble that we picked up last July",
            album = "Midnights",
            song = "Sweet Nothing",
        ),
        Quote(
            quote = "I laid the groundwork, and then \n Just like clockwork \n The dominoes cascaded in a line",
            album = "Midnights",
            song = "Mastermind",
        ),
        Quote(
            quote = "You were more than just a short time",
            album = "Midnights",
            song = "Bigger Than The Whole Sky",
        ),
        Quote(
            quote = "And we know it's never simple, never easy. Never a clean break, no one here to save me.",
            album = "Fearless",
            song = "Breathe",
        ),
        Quote(
            quote = "You took a swing, I took it hard. And down here from the ground I see who you are.",
            album = "Fearless",
            song = "Tell Me Why",
        ),
        Quote(
            quote = "Someday I'll be living in a big, old city and all you're ever gonna be is mean.",
            album = "Speak Now",
            song = "Mean",
        ),
        Quote(
            quote = "Your string of lights is still bright to me… Who you are is not where you've been.",
            album = "Speak Now",
            song = "Innocent",
        ),
        Quote(
            quote = "We are alone with our changing minds. We fall in love 'til it hurts or bleeds or fades in time.",
            album = "Red",
            song = "State Of Grace",
        ),
        Quote(
            quote = "And your mother's telling stories about you on a tee ball team. You taught me 'bout your past, thinking your future was me.",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "You wear your best apology, but I was there to watch you leave.",
            album = "Red",
            song = "The Last Time",
        ),
        Quote(
            quote = "Your close friends always seem to know \n When there's something really wrong",
            album = "Red",
            song = "The Moment I Knew",
        ),
        Quote(
            quote = "The more I think about it now, the less I know, all I know is that you drove us off the road.",
            album = "1989",
            song = "All You Had To Do Was Stay",
        ),
        Quote(
            quote = "Band-aids don't fix bullet holes. You say sorry just for show.",
            album = "1989",
            song = "Bad Blood",
        ),
        Quote(
            quote = "We play dumb \n But we know exactly what we're doing",
            album = "1989",
            song = "New Romantics",
        ),
        Quote(
            quote = "He says he's so in love \n He's finally got it right \n I wonder if he knows he's all I think about at night",
            album = "Taylor Swift",
            song = "Teardrops On My Guitar",
        ),
        Quote(
            quote = "One single thread of gold tied me to you",
            album = "Folklore",
            song = "Invisible String",
        ),
        Quote(
            quote = "Bustling crowds or silent sleepers \n You're not sure which is worse",
            album = "Evermore",
            song = "Champagne Problems",
        ),
        Quote(
            quote = "I'll go back to L.A. and the so-called friends who'll write books about me if I ever make it and wonder about the only soul who can tell which smiles I'm fakin'",
            album = "Evermore",
            song = "'Tis The Damn Season",
        ),
        Quote(
            quote = "Well, I like the way your hair falls in your face \n You got the keys to me \n I love each freckle on your face",
            album = "Fearless",
            song = "Jump Then Fall",
        ),
        Quote(
            quote = "Draw the cat eye sharp enough to kill a man",
            album = "Midnights",
            song = "Vigilante Shit",
        ),
        Quote(
            quote = "I'm so in love that I might stop breathing",
            album = "Midnights",
            song = "Paris",
        ),
        Quote(
            quote = "Put on your records and regret me \n I bent the truth too far tonight",
            album = "Midnights",
            song = "High Infidelity",
        ),
        Quote(
            quote = "I would've stayed \n On my knees \n And I damn sure never would've danced with the devil",
            album = "Midnights",
            song = "Would've, Could've, Should've",
        ),
        Quote(
            quote = "You've got a smile that could light up this whole town.",
            album = "Fearless",
            song = "You Belong With Me",
        ),
        Quote(
            quote = "And then you feel so low you can't feel nothing at all.",
            album = "Fearless",
            song = "Forever And Always",
        ),
        Quote(
            quote = "The saddest fear comes creeping in - that you never loved me or her, or anyone, or anything...",
            album = "Red",
            song = "I Knew You Were Trouble",
        ),
        Quote(
            quote = "I forget about you long enough to forget why I needed to...",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "When you're young, you just run, but you come back to what you need.",
            album = "1989",
            song = "This Love",
        ),
        Quote(
            quote = "Just because you're clean, don't mean you don't miss it.",
            album = "1989",
            song = "Clean",
        ),
        Quote(
            quote = "They'll take their shots, but we are bulletproof.",
            album = "1989",
            song = "I Know Places",
        ),
        Quote(
            quote = "To live for the hope of it all \n Cancel plans just in case you'd call \n And say, \"Meet me behind the mall\"",
            album = "Folklore",
            song = "August",
        ),
        Quote(
            quote = "Would've been right there, front row even if nobody came to your show",
            album = "Lover",
            song = "I Forgot That You Existed",
        ),
        Quote(
            quote = "I'm always waiting for you to be waiting below",
            album = "Lover",
            song = "Cruel Summer",
        ),
        Quote(
            quote = "For whatever it's worth, I love you, ain't that the worst thing you ever heard?",
            album = "Lover",
            song = "Cruel Summer",
        ),
        Quote(
            quote = "I've never seen someone lit from within \n Blurring out my periphery",
            album = "Midnights",
            song = "Snow On The Beach",
        ),
        Quote(
            quote = "And I'm not even sorry, nights are so starry",
            album = "Midnights",
            song = "Glitch",
        ),
        Quote(
            quote = "My mistake, I didn't know to be in love you had to fight to have the upper hand.",
            album = "Fearless",
            song = " White Horse",
        ),
        Quote(
            quote = "I knew you'd miss me once the thrill expired \n And you'd be standin' in my front porch light \n And I knew you'd come back to me",
            album = "Folklore",
            song = "Cardigan",
        ),
        Quote(
            quote = "\"This dorm was once a madhouse\" I made a joke, \"Well, it's made for me\"",
            album = "Evermore",
            song = "Champagne Problems",
        ),
        Quote(
            quote = "From sprinkler splashes to fireplace ashes \n I waited ages to see you there \n I search the party of better bodies \n Just to learn that you never cared",
            album = "Midnights",
            song = "You're On Your Own, Kid",
        ),
        Quote(
            quote = "Did you ever have someone kiss you in a crowded room",
            album = "Midnights",
            song = "Question...?",
        ),
        Quote(
            quote = "When I walk in the room \n I can still make the whole place shimmer",
            album = "Midnights",
            song = "Bejeweled",
        ),
        Quote(
            quote = "Never trust it if it rises fast \n It can't last",
            album = "Midnights",
            song = "Labyrinth",
        ),
        Quote(
            quote = "You said I have to trust more freely \n But diesel is desire, you were playing with fire",
            album = "Midnights",
            song = "The Great War",
        ),
        Quote(
            quote = "And I don't know why, but with you I'd dance in a storm in my best dress, fearless.",
            album = "Fearless",
            song = "Fearless",
        ),
        Quote(
            quote = "But in your life, you'll do things greater than dating the boy on the football team…But I didn't know it at fifteen.",
            album = "Fearless",
            song = "Fifteen",
        ),
        Quote(
            quote = "And when you take, you take the very best of me.",
            album = "Taylor Swift",
            song = "Cold As You",
        ),
        Quote(
            quote = "But no one notices until it's too late to do anything.",
            album = "Taylor Swift",
            song = "The Outside",
        ),
        Quote(
            quote = "All this time I was wasting, hoping you would come around… I've been giving out chances every time and all you do is let me down.",
            album = "Fearless",
            song = "You're Not Sorry",
        ),
        Quote(
            quote = "I don't know what I want, so don't ask me \n 'Cause I'm still trying to figure it out",
            album = "Taylor Swift",
            song = "A Place In This World",
        ),
        Quote(
            quote = "Photo album on the counter \n Your cheeks were turning red \n You used to be a little kid in glasses in a twin-sized bed",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "I've been spending the last eight months thinking all love ever does is break and burn and end…",
            album = "Red",
            song = "Begin Again",
        ),
        Quote(
            quote = "Didn't it all seem new and exciting? …It's all fun and games 'til somebody loses their mind.",
            album = "1989",
            song = "Wonderland",
        ),
        Quote(
            quote = "The monsters turned out to be just trees \n When the sun came up you were looking at me",
            album = "1989",
            song = "Out Of The Woods",
        ),
        Quote(
            quote = "I've got a list of names and yours is in red, underlined \n I check it once, then I check it twice",
            album = "Reputation",
            song = "Look What You Made Me Do",
        ),
        Quote(
            quote = "I'm drunk in the back of the car \n And I cried like a baby coming home from the bar \n Said, \"I'm fine,\" but it wasn't true",
            album = "Lover",
            song = "Cruel Summer",
        ),
        Quote(
            quote = "If the story is over, why am I still writing pages?",
            album = "Lover",
            song = "Death By A Thousand Cuts",
        ),
        Quote(
            quote = "The mark they saw on my collarbone \n The rust that grew between telephones \n The lips I used to call home",
            album = "Midnights",
            song = "Maroon",
        ),
        Quote(
            quote = "I thought the plane was goin' down \n How'd you turn it right around?",
            album = "Midnights",
            song = "Labyrinth",
        ),
        Quote(
            quote = "It rains when you're here and it rains when you're gone.",
            album = "Fearless",
            song = "Forever And Always",
        ),
        Quote(
            quote = "You call me up again just to break me like a promise, so casually cruel in the name of being honest.",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "Cause there we are again, when I loved you so. Back before you lost the one, real thing you've ever known.",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "“And they tell you that you're lucky, but you're so confused, 'cause you don't feel pretty, you just feel used.",
            album = "Red",
            song = "The Lucky One",
        ),
        Quote(
            quote = "You called me later \n And said, \"I'm sorry I didn't make it\" \n And I said, \"I'm sorry, too\"",
            album = "Red",
            song = "The Moment I Knew",
        ),
        Quote(
            quote = "Your kiss, my cheek \n I watch you leave \n Your smile, my ghost \n I fall to my knees",
            album = "1989",
            song = "This Love",
        ),
        Quote(
            quote = "I was walking home on broken cobblestones just thinking of you, when she pulled up like a figment of my worst intentions",
            album = "Folklore",
            song = "Betty",
        ),
        Quote(
            quote = "The night you danced like you knew our lives would never be the same \n You held your head like a hero \n On a history book page \n It was the end of a decade \n But the start of an age",
            album = "Speak Now",
            song = "Long Live",
        ),
        Quote(
            quote = "Knew I was a robber first time that he saw me \n Stealing hearts and running off and never sayin' sorry",
            album = "Reputation",
            song = "...Ready For It?",
        ),
        Quote(
            quote = "My name is whatever you decide \n And I'm just gonna call you mine",
            album = "Reputation",
            song = "Don't Blame Me",
        ),
        Quote(
            quote = "Without all the exes, fights, and flaws, we wouldn't be standing here so tall",
            album = "Lover",
            song = "Paper Rings",
        ),
        Quote(
            quote = "I can't dare to dream about you anymore",
            album = "Evermore",
            song = "Gold Rush",
        ),
        Quote(
            quote = "I'm damned if I do give a damn what people say",
            album = "Midnights",
            song = "Lavender Haze",
        ),
        Quote(
            quote = "Desert all your past lives \n And if you don't recognize yourself \n That means you did it right",
            album = "Midnights",
            song = "Dear Reader",
        ),
        Quote(
            quote = "This is a big world, that was a small town there in my rear view mirror disappearing now",
            album = "Fearless",
            song = "White Horse",
        ),
        Quote(
            quote = "My mind forgets to remind me you're a bad idea.",
            album = "Speak Now",
            song = "Sparks Fly",
        ),
        Quote(
            quote = "It turns out freedom ain't nothing but missing you.",
            album = "Speak Now",
            song = "Back To December",
        ),
        Quote(
            quote = "…That magic's not here no more. And I might be OK, but I'm not fine at all.",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "Time won't fly, it's like I'm paralyzed by it. I'd like to be my old self again, but I'm still trying to find it.",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "Now you mail back my things and I walk home alone \n But you keep my old scarf from that very first week, 'cause it reminds you of innocence and it smells like me.",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "But you'll come back each time you leave 'cause darling, I'm a nightmare dressed like a daydream.",
            album = "1989",
            song = "Blank Space",
        ),
        Quote(
            quote = "We're a crooked love in a straight line down.",
            album = "1989",
            song = "I Wish You Would",
        ),
        Quote(
            quote = "I'm only seventeen \n I don't know anything but I know I miss you",
            album = "Folklore",
            song = "Betty",
        ),
        Quote(
            quote = "Back when you fit in my poems like a perfect rhyme",
            album = "Red",
            song = "Holy Ground",
        ),
        Quote(
            quote = "But you stabbed me in the back while shaking my hand \n And therein lies the issue \n Friends don't try to trick you \n Get you on the phone and mind-twist you \n So I took an axe to a mended fence",
            album = "Reputation",
            song = "This Is Why We Can't Have Nice Things",
        ),
        Quote(
            quote = "I am an architect, I'm drawing up the plans",
            album = "Lover",
            song = "I Think He Knows",
        ),
        Quote(
            quote = "We were a fresh page on the desk, filling in the blanks as we go",
            album = "Lover",
            song = "Cornelia Street",
        ),
        Quote(
            quote = "And I can't talk to you when you're like this, staring out the window like I'm not your favorite town",
            album = "Lover",
            song = "False God",
        ),
        Quote(
            quote = "Did you hear my covert narcissism I disguise as altruism \n Like some kind of congressman?",
            album = "Midnights",
            song = "Anti-Hero",
        ),
        Quote(
            quote = "Lock broken, slur spoken \n Wound open, game token \n I didn't know you were keeping count",
            album = "Midnights",
            song = "High Infidelity",
        ),
        Quote(
            quote = "Heartbreak is the national anthem, we sing it proudly.",
            album = "1989",
            song = "New Romantics",
        ),
        Quote(
            quote = "32 and still growing up now \n Who you are is not what you did \n You're still an innocent",
            album = "Speak Now",
            song = "Innocent",
        ),
        Quote(
            quote = "I had a marvelous time ruining everything",
            album = "Folklore",
            song = "The Last Great American Dynasty",
        ),
        Quote(
            quote = "Untouchable, burning brighter than the sun \n And when you're close I feel like coming undone",
            album = "Fearless",
            song = "Untouchable",
        ),
        Quote(
            quote = "You asked me for a place to sleep, locked me out and threw a feast",
            album = "Reputation",
            song = "Look What You Made Me Do",
        ),
        Quote(
            quote = "Remember how I said I'd die for you?",
            album = "Lover",
            song = "False God",
        ),
        Quote(
            quote = "Wait for the signal, and I'll meet you after dark \n Show me the places where the others gave you scars",
            album = "Evermore",
            song = "Willow",
        ),
        Quote(
            quote = "And then it fades into the gray of my day-old tea 'Cause it could never be",
            album = "Evermore",
            song = "Gold Rush",
        ),
        Quote(
            quote = "And I lost you \n The one I was dancing with \n In New York, no shoes",
            album = "Midnights",
            song = "Maroon",
        ),
        Quote(
            quote = "How the hell did we lose sight of us again?",
            album = "Midnights",
            song = "Maroon",
        ),
        Quote(
            quote = "I'm never gonna meet \n What could've been would've been \n What should've been you",
            album = "Midnights",
            song = "Bigger Than The Whole Sky",
        ),
        Quote(
            quote = "Do you really wanna know where I was April 29th? \n Do I really have to chart the constellations in his eyes?",
            album = "Midnights",
            song = "High Infidelity",
        ),
        Quote(
            quote = "This is looking like a contest of who can act like they care less. But I liked it better when you were on my side.",
            album = "Speak Now",
            song = "The Story Of Us",
        ),
        Quote(
            quote = "So don't you worry your pretty, little mind, people throw rocks at things that shine.",
            album = "Speak Now",
            song = "Ours",
        ),
        Quote(
            quote = "He's long gone when he's next to me and I realize the blame is on me.",
            album = "Red",
            song = "I Knew You Were Trouble",
        ),
        Quote(
            quote = "No apologies. He'll never see you cry. Pretends he doesn't know that he's the reason why.",
            album = "Red",
            song = " I Knew You Were Trouble",
        ),
        Quote(
            quote = "I wish I could run to you. And I hope you know that every time I don't I almost do.",
            album = "Red",
            song = "I Almost Do",
        ),
        Quote(
            quote = "And I wish you knew that I miss you too much to be mad anymore.",
            album = "1989",
            song = "I Wish You Would",
        ),
        Quote(
            quote = "When I was drowning that's when I could finally breathe.",
            album = "1989",
            song = "Clean",
        ),
        Quote(
            quote = "They told me all of my cages were mental \n So I got wasted like all my potential",
            album = "Folklore",
            song = "This Is Me Trying",
        ),
        Quote(
            quote = "You drew stars around my scars \n But now I'm bleedin'",
            album = "Folklore",
            song = "Cardigan",
        ),
        Quote(
            quote = "The world goes on another day, another drama \n But not for me, all I think about is karma.",
            album = "Reputation",
            song = "Look What You Made Me Do",
        ),
        Quote(
            quote = "Fighting with a true love is boxing with no gloves \n Chemistry 'til it blows up, 'til there's no us",
            album = "Lover",
            song = "Afterglow",
        ),
        Quote(
            quote = "Sometimes I feel like everybody is a sexy baby \n And I'm the monster on the hill",
            album = "Midnights",
            song = "Anti-Hero",
        ),
        Quote(
            quote = "He wanted it comfortable, I wanted that pain",
            album = "Midnights",
            song = "Midnight Rain",
        ),
        Quote(
            quote = "I don't start shit, but I can tell you how it ends",
            album = "Midnights",
            song = "Vigilante Shit",
        ),
        Quote(
            quote = "They say that if it's right, you know",
            album = "Midnights",
            song = "Hits Differents",
        ),
        Quote(
            quote = "This night is sparkling, don't you let it go.  I'm wonderstruck, blushing all the way home.",
            album = "Speak Now",
            song = "Enchanted",
        ),
        Quote(
            quote = "Today is never too late to be brand new.",
            album = "Speak Now",
            song = "Innocent",
        ),
        Quote(
            quote = "Loving him is like driving a new Maserati down a dead-end street \n Faster than the wind, passionate as sin, ending so suddenly",
            album = "Red",
            song = "Red",
        ),
        Quote(
            quote = "I got that red lip, classic thing that you like.",
            album = "1989",
            song = "Style",
        ),
        Quote(
            quote = "Why'd you have to go and lock me out when I let you in?",
            album = "1989",
            song = "All You Had To Do Was Stay",
        ),
        Quote(
            quote = "While you've been getting down and out about the liars and the dirty, dirty cheats of the world… You could've been getting down to this sick beat.",
            album = "1989",
            song = "Shake It Off",
        ),
        Quote(
            quote = "So I punched a hole in the roof \n Let the flood carry away all my pictures of you.",
            album = "1989",
            song = "Clean",
        ),
        Quote(
            quote = "I don't like that falling feels like flying till the bone crush.",
            album = "Evermore",
            song = "Gold Rush",
        ),
        Quote(
            quote = "You know I didn't want to have to haunt you \n But what a ghostly scene",
            album = "Folklore",
            song = "My Tears Ricochet",
        ),
        Quote(
            quote = "Do you remember when I pulled up and said 'get in the car' \n And then cancelled my plans just in case you called",
            album = "Folklore",
            song = "August",
        ),
        Quote(
            quote = "Bold was the waitress on our three-year trip \n Getting lunch down by the Lakes \n She said I looked like an American singer",
            album = "Folklore",
            song = "Invisible String",
        ),
        Quote(
            quote = "Ocean blue eyes looking in mine \n I feel like I might sink and drown and die",
            album = "Reputation",
            song = "Gorgeous",
        ),
        Quote(
            quote = "With your face and the beautiful eyes \n And the conversation with the little white lies \n And the faded picture of a beautiful night",
            album = "Fearless",
            song = "The Other Side Of The Door",
        ),
        Quote(
            quote = "Never be so kind \n You forget to be clever \n Never be so clever \n You forget to be kind",
            album = "Evermore",
            song = "Marjorie",
        ),
        Quote(
            quote = "They said the end is comin' \n Everyone's up to somethin'",
            album = "Midnights",
            song = "Sweet Nothing",
        ),
        Quote(
            quote = "What if I told you none of it was accidental? \n And the first night that you saw me \n Nothing was gonna stop me",
            album = "Midnights",
            song = "Mastermind",
        ),
        Quote(
            quote = "Uh-huh, we're burned for better \n I vowed I would always be yours",
            album = "Midnights",
            song = "The Great War",
        ),
        Quote(
            quote = "She floats down the aisle like a pageant queen, but I know you wish it was me… don’t you?",
            album = "Speak Now",
            song = "Speak Now",
        ),
        Quote(
            quote = "Maybe we got lost in translation, maybe I asked for too much. But maybe this thing was a masterpiece 'til you tore it all up. Running scared, I was there, I remember it all too well.",
            album = "Red",
            song = "All Too Well",
        ),
        Quote(
            quote = "But sometimes I wonder how you think about it now.",
            album = "Red",
            song = "Holy Ground",
        ),
        Quote(
            quote = "The rest of the world was black and white, but we were in screaming color.",
            album = "1989",
            song = "Out Of The Woods",
        ),
        Quote(
            quote = "I once believed love would be burning red \n But it's golden",
            album = "Lover",
            song = "Daylight",
        ),
        Quote(
            quote = "I can't decide if it's a choice: Getting swept away",
            album = "Red",
            song = "Treacherous",
        ),
        Quote(
            quote = "Sometimes I wonder when you sleep \n Are you ever dreaming of me?",
            album = "Reputation",
            song = "Delicate",
        ),
        Quote(
            quote = "We were jet-set, Bonnie and Clyde \n Until I switched to the other side \n It's no surprise I turned you in \n 'Cause us traitors never win",
            album = "Reputation",
            song = "Getaway Car",
        ),
        Quote(
            quote = "We met a few weeks ago \n Now you try on callin' me \"Baby\" like tryin' on clothes",
            album = "Reputation",
            song = "King Of My Heart",
        ),
        Quote(
            quote = "I brought a knife to a gunfight",
            album = "Reputation",
            song = "Call It What You Want",
        ),
        Quote(
            quote = "I've got a hundred thrown-out speeches I almost said to you",
            album = "Lover",
            song = "The Archer",
        ),
        Quote(
            quote = "We were in the backseat drunk on something stronger than the drinks in the bar",
            album = "Lover",
            song = "Cornelia Street",
        ),
        Quote(
            quote = "What would you do if I break free and leave us in ruins, took this dagger in me and removed it, gain the weight of you then loose it?",
            album = "Evermore",
            song = "Tolerate It",
        ),
        Quote(
            quote = "Your nemesis will defeat themselves before you get the chance to swing",
            album = "Evermore",
            song = "Long Story Short",
        ),
        Quote(
            quote = "He can't see the smile I'm faking and my heart's not breaking 'cause I'm not feeling anything at all",
            album = "Fearless",
            song = "The Way I Loved You",
        ),
        Quote(
            quote = "Confess my truth \n In swooping, sloping, cursive letters",
            album = "Midnights",
            song = "Paris",
        ),
        Quote(
            quote = "I'm shining like fireworks over your sad, empty town.",
            album = "Speak Now",
            song = "Dear John",
        ),
        Quote(
            quote = "2AM, who do you love?",
            album = "Speak Now",
            song = "Enchanted",
        ),
        Quote(
            quote = "We're happy, free, confused, and lonely at the same time. It's miserable and magical.",
            album = "Red",
            song = "22",
        ),
        Quote(
            quote = "But I don't wanna dance if I'm not dancing with you.",
            album = "Red",
            song = "Holy Ground",
        ),
        Quote(
            quote = "So it's gonna be forever or it's gonna go down in flames.",
            album = "1989",
            song = "Blank Space",
        ),
        Quote(
            quote = "Someday when you leave me, I bet these memories follow you around.",
            album = "1989",
            song = "Wildest Dreams",
        ),
        Quote(
            quote = "It was months and months of back and forth, you're still all over me like a wine-stained dress I can't wear anymore.",
            album = "1989",
            song = "Clean",
        ),
        Quote(
            quote = "Cold was the steel of my axe to grind for the boys who broke my heart \n Now I send their babies presents",
            album = "Folklore",
            song = "Invisible String",
        ),
        Quote(
            quote = "You wear the same jewels that I gave you, as you bury me",
            album = "Folklore",
            song = "My Tears Ricochet",
        ),
        Quote(
            quote = "You did a number on me but, honestly, baby, who's counting?",
            album = "Reputation",
            song = "So It Goes...",
        ),
        Quote(
            quote = "You make me so happy it turns back to sad \n There's nothing I hate more than what I can't have \n And you are so gorgeous it makes me so mad",
            album = "Reputation",
            song = "Gorgeous",
        ),
        Quote(
            quote = "He built a fire just to keep me warm",
            album = "Reputation",
            song = "Call It What You Want",
        ),
        Quote(
            quote = "I'll never let you go 'cause I know this is a fight that someday we're gonna win",
            album = "Lover",
            song = "Miss Americana And The Heartbreak Prince",
        ),
        Quote(
            quote = "I come back stronger than a '90s trend",
            album = "Evermore",
            song = "Willow",
        ),
        Quote(
            quote = "Did you ever hear about the girl who got frozen? \n Time went on for everybody else, she won't know it \n She's still twenty-three inside her fantasy",
            album = "Evermore",
            song = "Right Where You Left Me",
        ),
        Quote(
            quote = "It's me, hi, I'm the problem, it's me \n At tea time, everybody agrees",
            album = "Midnights",
            song = "Anti-Hero",
        ),
        Quote(
            quote = "A slow-motion, love potion \n jumping off things in the ocean",
            album = "Midnights",
            song = "Midnight Rain",
        ),
        Quote(
            quote = "“So watch me strike a match on all my wasted time.",
            album = "Taylor Swift",
            song = "Picture To Burn",
        ),
        Quote(
            quote = "Our song is the slamming screen door, sneakin' out late, tapping on your window.",
            album = "Taylor Swift",
            song = "Our Song",
        ),
        Quote(
            quote = "I've found time can heal most anything and you just might find who you're supposed to be.",
            album = "Fearless",
            song = "Fifteen",
        ),
        Quote(
            quote = "I'll be strong, I'll be wrong, oh but life goes on…",
            album = "Taylor Swift",
            song = "A Place In This World",
        ),
        Quote(
            quote = "Romeo, save me. They're trying to tell me how to feel. This love is difficult but it's real.",
            album = "Fearless",
            song = "Love Story",
        ),
        Quote(
            quote = "Stay, and I'll be loving you for quite some time \n No one else is gonna love me when I get mad",
            album = "Red",
            song = "Stay Stay Stay",
        ),
        Quote(
            quote = "The lights are so bright, but they never blind me.",
            album = "1989",
            song = "Welcome To New York",
        ),
        Quote(
            quote = "When we go crashing down, we come back every time 'cause we never go out of style.",
            album = "1989",
            song = "Style",
        ),
        Quote(
            quote = "You search the world for something else to make you feel like what we had. And in the end in wonderland, we both went mad.",
            album = "1989",
            song = "Wonderland",
        ),
        Quote(
            quote = "Can we always be this close forever and ever?",
            album = "Lover",
            song = "Lover",
        ),
        Quote(
            quote = "You play stupid games, you win stupid prizes",
            album = "Lover",
            song = "Miss Americana And The Heartbreak Prince",
        ),
        Quote(
            quote = "Barefoot in the kitchen \n Sacred new beginnings \n That became my religion, listen",
            album = "Lover",
            song = "Cornelia Street",
        ),
        Quote(
            quote = "I could build a castle out of all the bricks they threw at me",
            album = "1989",
            song = "New Romantics",
        ),
        Quote(
            quote = "He said the way my blue eyes shined \n Put those Georgia stars to shame that night \n I said, 'That's a lie'",
            album = "Taylor Swift",
            song = "Tim McGraw",
        ),
        Quote(
            quote = "I persist and resist the temptation to ask you \n If one thing had been different \n Would everything be different today?",
            album = "Folklore",
            song = "The 1",
        ),
        Quote(
            quote = "Time, mystical time \n Cutting me open, then healing me fine \n Were there clues I didn't see?",
            album = "Folklore",
            song = "Invisible String",
        ),
        Quote(
            quote = "You know I'm not a bad girl, but I \n Do bad things with you",
            album = "Reputation",
            song = "So It Goes...",
        ),
        Quote(
            quote = "Your love is a secret I'm hoping, dreaming, dying to keep",
            album = "Reputation",
            song = "King Of My Heart",
        ),
        Quote(
            quote = "Is this the end of all the endings? \n My broken bones are mending",
            album = "Reputation",
            song = "King Of My Heart",
        ),
        Quote(
            quote = "I loved you in spite of deep fears that the world would divide us",
            album = "Reputation",
            song = "Dancing With Our Hands Tied",
        ),
        Quote(
            quote = "Say that we got it \n I'm a mess, but I'm the mess that you wanted",
            album = "Reputation",
            song = "Dancing With Our Hands Tied",
        ),
        Quote(
            quote = "I want to wear his initial on a chain round my neck, not because he owns me, but cause he really knows me, which is more than they can say",
            album = "Reputation",
            song = "Call It What You Want",
        ),
        Quote(
            quote = "Holding my breath, slowly, I said \"You don't need to save me, but would you run away with me?\"",
            album = "Reputation",
            song = "Call It What You Want",
        ),
        Quote(
            quote = "I'm with you even if it makes me blue",
            album = "Lover",
            song = "Paper Rings",
        ),
        Quote(
            quote = "I pinned your hands behind your back \n Thought I had reason to attack, but no",
            album = "Lover",
            song = "Afterglow",
        ),
        Quote(
            quote = "You told your family for a reason \n You couldn't keep it in \n Your sister splashed out on the bottle",
            album = "Evermore",
            song = "Champagne Problems",
        ),
        Quote(
            quote = "Sometimes you just don't know the answer 'til someone's on their knees and asks you",
            album = "Evermore",
            song = "Champagne Problems",
        ),
        Quote(
            quote = "So yeah, it's a fire, it's a goddamn blaze in the dark and you've started it \n So yeah, it's a war, it's the goddamn fight of my life and you started it",
            album = "Evermore",
            song = "Ivy",
        ),
        Quote(
            quote = "Breaking down and coming undone \n It's a rollercoaster kind of rush",
            album = "Fearless",
            song = "The Way I Loved You",
        ),
        Quote(
            quote = "Flexing like a goddamn acrobat \n Me and karma vibe like that",
            album = "Midnights",
            song = "Karma",
        ),
        Quote(
            quote = "Never take advice from someone who's falling apart",
            album = "Midnights",
            song = "Dear Reader",
        ),
        Quote(
            quote = "I lived in your chess game, but you changed the rules every day.",
            album = "Speak Now",
            song = "Dear John",
        ),
        Quote(
            quote = "I'd tell you I miss you, but I don't know how, I've never heard silence quite this loud.",
            album = "Speak Now",
            song = "The Story Of Us",
        ),
        Quote(
            quote = "Love is a ruthless game unless you play it good and right.",
            album = "Red",
            song = "State Of Grace",
        ),
        Quote(
            quote = "People like you always want back the love they pushed aside, but people like me are gone forever when you say goodbye.",
            album = "1989",
            song = "All You Had To Do Was Stay",
        ),
        Quote(
            quote = "Makes you wanna run and hide, but it made us turn right back around.",
            album = "1989",
            song = "I Wish You Would",
        ),
        Quote(
            quote = "I swear I don't love the drama, it loves me",
            album = "Reputation",
            song = "End Game",
        ),
        Quote(
            quote = "Love made me crazy, if it doesn't, you ain't doin' it right",
            album = "Reputation",
            song = "Don't Blame Me",
        ),
        Quote(
            quote = "Handsome, you're a mansion with a view",
            album = "Reputation",
            song = "Delicate",
        ),
        Quote(
            quote = "My mind turns your life into folklore \n I can't dare to dream about you anymore",
            album = "Evermore",
            song = "Gold Rush",
        ),
        Quote(
            quote = "I made you my temple, my mural, my sky. Now I'm begging for footnotes in the story of your life \n Drawing hearts in the byline always taking up too much space or time",
            album = "Evermore",
            song = "Tolerate It",
        ),
        Quote(
            quote = "My waves meet your shore ever and evermore",
            album = "Evermore",
            song = "Long Story Short",
        ),
        Quote(
            quote = "All they keep asking me \n Is if I'm gonna be your bride",
            album = "Midnights",
            song = "Lavender Haze",
        ),
        Quote(
            quote = "Flying in a dream \n stars by the pocketful",
            album = "Midnights",
            song = "Snow On The Beach",
        ),
        Quote(
            quote = "And what's that that I heard? That you're still with her?",
            album = "Midnights",
            song = "Question...?",
        ),
        Quote(
            quote = "Did all the extra credit, then got graded on a curve",
            album = "Midnights",
            song = "Bejeweled",
        ),
        Quote(
            quote = "And don't lose the way that you dance around in your pj's getting ready for school.",
            album = "Speak Now",
            song = "Never Grow Up",
        ),
        Quote(
            quote = "Words, how little they mean when you're a little too late.",
            album = "Red",
            song = "Sad Beautiful Tragic",
        ),
        Quote(
            quote = "And what do you do when the one who means the most to you is the one who didn't show?",
            album = "Red",
            song = "The Moment I Knew",
        ),
        Quote(
            quote = "This love left a permanent mark.",
            album = "1989",
            song = "This Love",
        ),
        Quote(
            quote = "Please don't ever become a stranger whose laugh I could recognize anywhere",
            album = "Reputation",
            song = "New Year's Day",
        ),
        Quote(
            quote = "But she wears short skirts \n I wear T-shirts \n She's cheer captain \n And I'm on the bleachers",
            album = "Fearless",
            song = "You Belong With Me",
        ),
        Quote(
            quote = "We gather stones, never knowing what they'll mean \n Some to throw, some to make a diamond ring",
            album = "Folklore",
            song = "My Tears Ricochet",
        ),
        Quote(
            quote = "They say the road gets hard and you get lost",
            album = "Lover",
            song = "False God",
        ),
        Quote(
            quote = "I parked my car right between the Methodist and the school that used to be ours",
            album = "Evermore",
            song = "'Tis The Damn Season",
        ),
        Quote(
            quote = "I gave my blood, sweat, and tears for this \n I hosted parties and starved my body \n Like I'd be saved by a perfect kiss",
            album = "Midnights",
            song = "You're On Your Own, Kid",
        ),
        Quote(
            quote = "You and I walk a fragile line; I have known it all this time. But I never thought I'd live to see it break.",
            album = "Speak Now",
            song = "Haunted",
        ),
        Quote(
            quote = "You give me everything and nothing.",
            album = "1989",
            song = "I Wish You Would",
        ),
        Quote(
            quote = "When all you wanted \n Was to be wanted \n Wish you could go back \n And tell yourself what you know now",
            album = "Fearless",
            song = "Fifteen",
        ),
        Quote(
            quote = "I'm doing good, I'm on some new shit \n Been saying \"yes\" instead of \"no\" \n I thought I saw you at the bus stop, I didn't though",
            album = "Folklore",
            song = "The 1",
        ),
        Quote(
            quote = "I guess you never know, never know \n And if you wanted me, you really should've showed",
            album = "Folklore",
            song = "The 1",
        ),
        Quote(
            quote = "When you are young they assume you know nothing",
            album = "Folklore",
            song = "Cardigan",
        ),
        Quote(
            quote = "Devils roll the dice, angels roll their eyes \n What doesn't kill me makes me want you more",
            album = "Lover",
            song = "Cruel Summer",
        ),
        Quote(
            quote = "I ask the traffic lights if it will be alright, they say I don't know.",
            album = "Lover",
            song = "Death By A Thousand Cuts",
        ),
        Quote(
            quote = "One for the money, two for the show \n I never was ready so I watch you go",
            album = "Evermore",
            song = "Champagne Problems",
        ),
        Quote(
            quote = "You're talking shit for the hell of it",
            album = "Midnights",
            song = "Karma",
        )
    )

    fun all(): List<Quote> {
        return quotes
    }

    fun filterByAlbum(albumName: String): List<Quote> {
        return quotes.filter { quote: Quote -> quote.getAlbumName() == albumName }
    }

    fun filterBySong(songName: String): List<Quote> {
        return quotes.filter { quote: Quote -> quote.getSongName() == songName }
    }

    fun randomQuote(): Quote {
        return quotes.random()
    }
}