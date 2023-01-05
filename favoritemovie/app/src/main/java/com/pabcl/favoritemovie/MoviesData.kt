package com.pabcl.favoritemovie

object MoviesData {
    private val moviesName = arrayOf(
        "The Batman",
        "Black Panther",
        "Black Panther : Wakanda Forever",
        "The Shawshank Redemption",
        "Tenet",
        "Interstellar",
        "Parasite",
        "Nightcrawler",
        "1917",
        "Wall-E",
        "No Country for Old Men",
        "Hunter Killer",
        "Extraction",
        "Black Hawk Dawn",
        "Silent Voice"
    )

    private val moviesGenre = arrayOf(
        "Action, Crime, Drama",
        "Action, Adventure, Sci-Fi",
        "Action, Adventure, Drama",
        "Drama",
        "Sci-Fi, Thriller, Action",
        "Adventure, Drama,  Sci-Fi",
        "Drama, Thriller",
        "Crime, Drama, Thriller",
        "Action, Drama, War",
        "Animation, Adventure, Family",
        "Crime, Drama, Thriller",
        "Action, Thriller",
        "Action, Thriller",
        "Action, Drama, History",
        "Animation, Drama"
    )

    private val moviesYear = arrayOf(
        "2022",
        "2018",
        "2022",
        "1994",
        "2020",
        "2014",
        "2019",
        "2014",
        "2019",
        "2008",
        "2007",
        "2018",
        "2020",
        "2001",
        "2016"
    )

    private val moviesDetails = arrayOf(
        "Batman ventures into Gotham City's underworld when a sadistic killer leaves behind a trail of cryptic clues. As the evidence begins to lead closer to home and the scale of the perpetrator's plans become clear, he must forge new relationships, unmask the culprit and bring justice to the abuse of power and corruption that has long plagued the metropolis.",
        "After the events of Captain America: Civil War, Prince T'Challa returns home to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new king. However, T'Challa soon finds that he is challenged for the throne from factions within his own country. When two foes conspire to destroy Wakanda, the hero known as Black Panther must team up with C.I.A. agent Everett K. Ross and members of the Dora Milaje, Wakandan special forces, to prevent Wakanda from being dragged into a world war.",
        "Queen Ramonda, Shuri, M'Baku, Okoye and the Dora Milaje fight to protect the kingdom of Wakanda from intervening world powers in the wake of King T'Challa's death. As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross and forge a new path for their nation.",
        "Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man's unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red.",
        "In a twilight world of international espionage, an unnamed CIA operative, known as The Protagonist, is recruited by a mysterious organization called Tenet to participate in a global assignment that unfolds beyond real time. The mission: prevent Andrei Sator, a renegade Russian oligarch with precognition abilities, from starting World War III. The Protagonist will soon master the art of time inversion as a way of countering the threat that is to come.",
        "Earth's future has been riddled by disasters, famines, and droughts. There is only one way to ensure mankind's survival: Interstellar travel. A newly discovered wormhole in the far reaches of our solar system allows a team of astronauts to go where no man has gone before, a planet that may have the right environment to sustain human life.",
        "Jobless, penniless, and, above all, hopeless, the unmotivated patriarch, Ki-taek, and his equally unambitious family--his supportive wife, Chung-sook; his cynical twentysomething daughter, Ki-jung, and his college-age son, Ki-woo--occupy themselves by working for peanuts in their squalid basement-level apartment. Then, by sheer luck, a lucrative business proposition will pave the way for an ingeniously insidious scheme, as Ki-woo summons up the courage to pose as an English tutor for the teenage daughter of the affluent Park family. Now, the stage seems set for an unceasing winner-take-all class war. /n How does one get rid of a parasite?",
        "NIGHTCRAWLER is a thriller set in the nocturnal underbelly of contemporary Los Angeles. Jake Gyllenhaal stars as Lou Bloom, a driven young man desperate for work who discovers the high-speed world of L.A. crime journalism. Finding a group of freelance camera crews who film crashes, fires, murder and other mayhem, Lou muscles into the cut-throat, dangerous realm of nightcrawling - where each police siren wail equals a possible windfall and victims are converted into dollars and cents. Aided by Rene Russo as Nina, a veteran of the blood-sport that is local TV news, Lou blurs the line between observer and participant to become the star of his own story.",
        "April 1917, the Western Front. Two British soldiers are sent to deliver an urgent message to an isolated regiment. If the message is not received in time the regiment will walk into a trap and be massacred. To get to the regiment they will need to cross through enemy territory. Time is of the essence and the journey will be fraught with danger.",
        "WALL-E, short for Waste Allocation Load Lifter Earth-class, is the last robot left on Earth. He spends his days tidying up the planet, one piece of garbage at a time. But during 700 years, WALL-E has developed a personality, and he's more than a little lonely. Then he spots EVE, a sleek and shapely probe sent back to Earth on a scanning mission. Smitten WALL-E embarks on his greatest adventure yet when he follows EVE across the galaxy.",
        "In rural Texas, welder and hunter Llewelyn Moss (Josh Brolin) discovers the remains of several drug runners who have all killed each other in an exchange gone violently wrong. Rather than report the discovery to the police, Moss decides to simply take the two million dollars present for himself. This puts the psychopathic killer, Anton Chigurh (Javier Bardem), on his trail as he dispassionately murders nearly every rival, bystander and even employer in his pursuit of his quarry and the money. As Moss desperately attempts to keep one step ahead, the blood from this hunt begins to flow behind him with relentlessly growing intensity as Chigurh closes in. Meanwhile, the laconic Sheriff Ed Tom Bell (Tommy Lee Jones) blithely oversees the investigation even as he struggles to face the sheer enormity of the crimes he is attempting to thwart.",
        "A U.S. submarine, the USS Tampa Bay, vanishes while shadowing a Russian Akula-class submarine in the Arctic. Rear Admiral John Fisk sends a Virginia-class submarine, the USS Arkansas, under the command of newly-promoted and unorthodox Commander Joe Glass to investigate. At the same time, a Navy SEAL team under the command of Lieutenant Bill Beaman is sent in to discreetly observe a Russian naval base. When they arrive at the naval base, they witness defense minister Dmitri Durov conducting a coup d'etat and taking Russian President Zakarin prisoner, and swiftly realize that Durov intends to trigger a war.",
        "In an underworld of weapons dealers and traffickers, a young boy becomes the pawn in a war between notorious drug lords. Trapped by kidnappers inside one of the world's most impenetrable cities, his rescue beckons the unparalleled skill of a mercenary named Tyler Rake, but Rake is a broken man with nothing to lose, harboring a death wish that makes an already deadly mission near impossible.",
        "Action/war drama based on the best-selling book detailing a near-disastrous mission in Somalia on October 3, 1993. On this date nearly 100 U.S. Army Rangers, commanded by Capt. Mike Steele, were dropped by helicopter deep into the capital city of Mogadishu to capture two top lieutenants of a Somali warlord. This led to a large and drawn-out firefight between the Army Rangers, US Special Forces, and hundreds of Somali gunmen, resulting in the destruction of two U.S. Black Hawk helicopters. The film focuses on the heroic efforts of various Rangers to get to the downed helicopters, centering on SSG Eversmann, leading the Ranger unit Chalk Four to the first crash site, Chief Warrant Officer Durant who was captured after being the only survivor of the second crash, as well as many others who were involved.",
        "The story revolves around Shôko Nishimiya, a grade school student who has impaired hearing. She transfers into a new school, where she is bullied by her classmates, especially Shôya Ishida. It gets to the point where she transfers to another school and as a result, Shôya is ostracized and bullied himself, with no friends to speak to and no plans for the future. Years later, he epicly sets himself on a path to redemption."
    )
    private val moviesImages = intArrayOf(
        R.drawable.the_batman,
        R.drawable.black_panther,
        R.drawable.black_panther_2,
        R.drawable.the_shawshank_redemption,
        R.drawable.tenet,
        R.drawable.interstellar,
        R.drawable.parasite,
        R.drawable.nightcrawler,
        R.drawable.a_1917,
        R.drawable.wall_e,
        R.drawable.no_country_for_old_men,
        R.drawable.hunter_killer,
        R.drawable.extraction,
        R.drawable.black_hawk_dawn,
        R.drawable.silent_voice
    )

    val listData : ArrayList<Movies>
        get() {
            val list = arrayListOf<Movies>()
            for (position in moviesName.indices){
                val movies = Movies()
                movies.name = moviesName[position]
                movies.genre = moviesGenre[position]
                movies.year = moviesYear[position]
                movies.detail = moviesDetails[position]
                movies.photo = moviesImages[position]
                list.add(movies)
            }
            return list
        }
}