package com.example.trouvaille;

public class DetailsClass {

    String name;
    String address;
    String timings;
    String about;
    String reviews;
    String contact;

    public DetailsClass(String name, String address, String timings, String about, String reviews, String contact) {
        this.name = name;
        this.address = address;
        this.timings = timings;
        this.about = about;
        this.reviews = reviews;
        this.contact = contact;
    }

    public static final DetailsClass[] foodInfo =
            {new DetailsClass("KFC"
                    ,"SN 4 to 9, 1st Floor, Paramount Symphony, National Highway 24, Crossings Republik, Ghaziabad, Uttar Pradesh 201001"
                    ,"11am - 10pm"
                    ,"KFC is a global chicken restaurant brand with a rich, decades-long history of success and innovation. It all started with one cook, Colonel Harland Sanders, who created a finger lickin’ good recipe more than 75 years ago—a list of 11 secret herbs and spices scratched out on the back of his kitchen door. Today, we still follow his formula for success, with real cooks breading and freshly preparing our delicious chicken by hand in more than 23,000 restaurants in over 135 countries and territories around the world."
                    ,"When I think about crispy fried chicken recipe then at first thought about KFC fried chicken. KFC always provides crispy crunchy chicken. I think KFC is the world's no one brand who provides most yummy chicken.&&&&My nana took me to KFC and they gave me a cookie with my meal! I also love spicy chickennnn! Go eat KFC nowwww! I'm so happy I could just eat all the chicken in the world. ILY KFC. I rate this 5 stars!!"
                    ,"0120 339 9444")
            ,new DetailsClass("Barbeque Nation"
                    ," 05th Floor, Gaur Central Mall A-1 to A-4, RDC, Raj Nagar, Ghaziabad, Uttar Pradesh 201002"
                    ,"12pm - 8pm"
                    ,"Nationwide chain serving grilled meats & vegetables as well as occasional buffet deals.\nIndian cuisine is a natural part of the diet in the markets in which the Barbeque Nation Restaurants operate. We continue to offer new menu options, both vegetarian and non-vegetarian, largely based on Indian cuisine and use seasonal customer preferences to introduce new dishes. We also run popular food festivals at our Barbeque Nation Restaurants, thereby offering our customers a range of Indian and international cuisines."
                    ,"Good food, great staff and services are beyond expectations... Loved it.. visiting very soon again&&&&Staff is really good and they serve tasty and yummy veg starters but average main course and desserts.&&&&Just love the place, food, music everything. Staff was very helpful and friendly. It was my father's bdday and they compliment us with a cake. That was complimentary with buffet. Nice experience thankyou so much"
                    ," 085859 56060")
            ,new DetailsClass("Mi Amor"
                    ," D19, near Pizza Hut, RDC, Sector 15, P & T Colony, Raj Nagar, Ghaziabad, Uttar Pradesh 201002"
                    ,"10am - 8pm"
                    ,"This fine-dining multi-cuisine café is in Raj Nagar, Ghaziabad. The ambience of this place is elegant yet simple with wooden décor. The place is quite spacious with a comfortable seating area."
                    ,"Creamy ,moist and tasty cake , if there would be more kit Kats and gems pieces , would have loved the cake even more.&&&&This was my sons birthday party and I was amazed with the hassle free arrangement . Polite staff and good food was cherry on top. Also for kids everything at one roof from cakes to good food to games and shows arrangement. Highly recommend as it’s very cost effective with good quality food.&&&&"
                    ,"085100 17755")
            ,new DetailsClass("Mashaya"
                    ," Ground floor, C-91, RDC, Raj Nagar, Ghaziabad, Uttar Pradesh 201001"
                    ,"11am - 12am"
                    ,"Mashaya Restaurant is one of the best restaurants in Raj Nagar, Ghaziabad. Mashaya Restaurant operating timings are 12Noon – 12Midnight. Mashaya Restaurant has 6 room(s) and has its own DJ service and serves liquor."
                    ,"Beautiful place for hangout with your friends....tasty food.... classy interior &&&&Very nice place for hungry people, best service, good qualities&&&&The food is excellent and delicious . They serve very systematically and very kind and polite serving staff. They are really good"
                    ,"089206 29677")
            ,new DetailsClass("Orchid"
                    ,"Shramik Kunj, Sector 66, Noida, Uttar Pradesh 201301"
                    ,"10am - 8pm"
                    ," An array of culinary delights and sumptuous buffets make Orchid a 24 hour multi-cuisine restaurant, an ideal venue for a luncheon meeting or a relaxed dinner. You can also choose from an extensive a la carte menu to relish the food of your choice."
                    ,"Nice Place for small gatherings. Well connected location. This place can accommodate about 150~200 persons.&&&&Nice for low budget and for few people...&&&&I am sure that if you have been living in Delhi since long you would have not missed this place. Its one of the Iconic places in Delhi and many of the citizens specially the vegetarian kinds go to this place regularly. I like the main course and  coffee here."
                    ,"089206 29677")
            ,new DetailsClass("Burger King"
                    ,"Unit No D 31, District Center, Raj Nagar, Ghaziabad, Uttar Pradesh 201001"
                    ,"11am - 11pm"
                    ,"Founded in 1954, BURGER KING® is the second largest fast food hamburger chain in the world. The original HOME OF THE WHOPPER®, our commitment to premium ingredients, signature recipes, and family-friendly dining experiences is what has defined our brand for more than 50 successful years."
                    ,"I love their food but their service is a hit or miss at times. Their Whopper is awesome. Prices are good. The best thing about their burgers is that they taste of a true grill vs a non flamed taste. I'll continue to go there but they need to deal with some of their employees accordingly.&&&&Although I try to avoid fast food, BK is one of the only joints where I can get a vegetarian meal that doesn’t just consist of French fries. The impossible whopper has been a game changer, but sometimes I wish they offered it in a smaller size like a normal burger."
                    ,"097735 05482")
            };

    public static final DetailsClass[] cafeInfo = {
            new DetailsClass("Readers Cafe"
                    ,"Plot No 16, B-208-212, First Floor, Indirapuram Habitat Centre, Ahinsa Khand 1, Indirapuram, Ghaziabad, Uttar Pradesh 201014"
                    ,"11am - 9:30pm"
                    ,"This is a place for readers to congregate, sit their buttocks down, open their books to the page they were at, and never get up. Ever.\nThey’ve got a massive collection of classics, and mainstream books. Here’s the main point – it’s a book store cum library, cum café. You can buy a book, pick up any book from their borrowing section for as long as you’re in the café, order a coffee and forget a world exists outside the door of this café."
                    ,"This is probably the best Cafe in Ghaziabad. A must visit place for everyone. It has a great collection of books and nice place to read them hence the name of the place. The food is delicious, well priced and the place offers a great ambience. I always end up visiting that place whenever I am around the city.&&&&Amazing interior, very friendly staff a perfect place to hangout..."
                    ,"098719 21663")
            ,new DetailsClass("Cafe Wink"
                    ,"Sikha Galaxy Complex, G-1, near Dav Public School, Shreshtha Vihar, Anand Vihar, New Delhi, 110092"
                    ,"12pm - 11pm"
                    ,"Pop into this pretty place for a date with bae. The wooden furniture, combined with the all-white and minimally-done interiors create a very soothing vibe. Plus, we get excited just thinking of their Kit-Kat shake and the cheesy veg lasagna and nachos."
                    ,"One of the best place for Hangout on East Delhi. Ambiance is good and Food is also Tasty and Staff and service is overall good . I tried Mushroom Pasta and 5 start Shake ! Super awesome&&&&Small cafe but nyc food. A bit expensive though with less quantity but food is amazing. We tried pink sauce pasta, omg grilled sandwhich and cheesy baked nachos.&&&&Small place, nice ambience, courteous staff,  menu is good. Comfortable place for an evening or afternoon hangout with friends."
                    ,"011 4359 6979")
            ,new DetailsClass("Cafe Coffee Day"
                    ,"Ground Floor, The Opulent Mall, NH 91, Gandhi Nagar, Dasna Gate, Ghaziabad, Uttar Pradesh 201001"
                    ,"11am - 7pm"
                    ,"Café Coffee Day (CCD) is an Indian café chain. It is a subsidiary of Coffee Day Enterprises Limited. Coffee Day serves 1.6 billion cups of coffee annually in six countries. Internationally, CCDs are present in Austria, Czech Republic, Malaysia, Nepal and Egypt."
                    ,"The ambiance of this CCD is different from others. Had a coffee, and sandwiches and was very good. Not very crowded&&&&Was there to pick up some snack and a short break. Experience was inviting. The service at the counter could have been a tad faster but on the whole it was well maintained and kept friendly.&&&&Menu for coffee is good for all the atmospheres. Food they serve for snacks is mostly frozen and preserved."
                    ," 1800 102 5093")

            ,new DetailsClass("Barista Lavazza"
                    ,"Pacific Mall, Plot Alpha, Sahibabad Industrial Area Site 4, Sahibabad, Ghaziabad, Uttar Pradesh 201010"
                    ,"10am - 10pm"
                    ,"Barista is a lovely outlet to sit and spend your time, here you have variety of coffee in hot and cold options. however I find little expensive to have coffee here . Barista is a cool, nice cafe to catch up with friends. Music played is always very lively and soothing."
                    ,"if you have a real craving for coffee you can definitely visit this place. The side snacks options are not that great.&&&&This is a decent option if want to have a coffee. One of the most visited place of mine and my favourite one is cape chino.&&&&Here you can spend a good time with your partner,friends or family.Here you will find a lot of good snacks and drinks besides good coffee."
                    ,"0120 413 5927")
            ,new DetailsClass("Frost n Fun"
                    ,"GF - 21, RDC Market, Raj Nagar Ghaziabad, Raj Nagar, Ghaziabad"
                    ,"10am - 8pm"
                    ,"Offering a wide spectrum of fast food items at pretty economical prices, this is an excellent spot to fill up the belly without emptying the wallet. Listed on a well-curated menu, the food here is quite delicious and served in generous, fulfilling portions. The interiors are pretty decent with ample seating space available for small groups to comfortably spend some time. Recommended - White Sauce Pasta, Kadhai French Fries, and Sandwiches"
                    ,"Awsome place ..food is almost good in reasnable price&&&&Cheaper rates than others and value for money. Must try.&&&&Value for money cafe , awesome taste and cool place to hangout."
                    ,"120 4722236")

    };

    public static final DetailsClass[] shoppingInfo = {
            new DetailsClass("Shipra Mall"
                    ,"9, Vaibhav Khand, Indirapuram, Ghaziabad, Uttar Pradesh 201014"
                    ,"11am - 9:30pm"
                    ,"Shipra Group, launched its largest mall in NCR inspired by classical Roman-style architecture. Situated at Indirapuram with 4.5 lakh sq. ft of total area, Shipra Mall commits to offer a unique shopping experience with over 100 national & international brands and entertainment. The mall has been designed as a one-stop-destination for entertainment and leisure. Its state-of-the-art 3 Screen Multiplex, ‘Just About Movies’ (JAM) has one of the widest and the largest screens in India."
                    ,"Best ambience and you get all big brands be it food or clothing all at one place&&&&Good collection by evok furniture & good condition by saels staff&&&&Not  many options. Old stock of cloths and gadgets. Every thing is Over price. But Burger King is worthy"
                    ," 0120 418 6300")
            ,new DetailsClass("Opulent Mall"
                    ,"C-115, GT Road, East Model Town, Gandhi Nagar, Nehru Nagar III, Nehru Nagar, Ghaziabad, Uttar Pradesh 201001"
                    ,"9:30am - 9:30pm"
                    ,"The Opulent Mall, Ghaziabad is a One Stop Shopping and Entertainment Destination for all Shopaholics in Ghaziabad. It is a stylish, posh, vibrant, upscale, unique shopping and leisure environment in the Heart of the City.It is a sister concern of \"SVP Builders India Ltd\" &\"Ganesh Infrabuild Private Limited\" launched in March 2010. The architecture of the mall makes us proud which is designed by \"Five Vision Promoters Pvt. Ltd\". The Mall comprise of Retail, Entertainment, Food Court, PVR, Spa etc. It's Ghaziabad's most stunning shopping destinations for all shopacholic consumers. Are you interested in booking of \"Kiosk, Signages, Spot Promotions, Leasing of Shops, Events\" at The Opulent Mall, Ghaziabad. The Opulent Mall, Ghaziabad is a lifestyle and leisure destination located at the heart of Ghaziabad City, is a sister concern of \"SVP Builders India Ltd\", launched in March 2010. The architecture of the mall makes us proud which is designed by \"Five Vision Promoters Pvt. Ltd\". The Mall comprise of Retail, Entertainment, Food Court, PVR, Spa etc. It is Ghaziabad's most stunning shopping destinations for shopacholic consumers"
                    ,"Wonderful experience for watching movie or eating food or shopping with family&&&&Its a good place to spend time, the staff is a bit rude&&&&It's good for kids as they can do many activities here. Food court is very bad and the service is worse. Movie Theater is not bad and if you are living in Ghaziabad so it is good place for shopping despite I didn't get a single good shirt here."
                    ,"082871 20120")
            ,new DetailsClass("Pacific Mall"
                    ,"Site 4, Sahibabad Indl. Area, Ghaziabad - 201010"
                    ,"11am - 8:30pm"
                    ,"In 2008, Pacific Mall in Ghaziabad opened with a motive to place local as well as international brands side by side. It was a five lac sqftinnovative business model where the visitors had the luxury to access the 4-star hotel within the mall. Back then, it was first of its kind. Now, Clarks Inn at Pacific has become a lavish choice facilitating every luxury and entertainment under a single roof."
                    ,"pacific mall was a great place to get self-entertained. the food court was very interesting and exciting&&&&Pacific Mall is one of the famous mall there. Its a great shopping mall where we can each and every thing we want to purchase. It is little bit costly but branded"
                    ,"0120 - 404 4000")
            ,new DetailsClass("Indirapuram Habitat Center"
                    ," Ahinsa Khand 1, Indirapuram, Ghaziabad, Uttar Pradesh 201014"
                    ,"9am - 10:30pm"
                    ,"Victory Infratech is coming up with a master piece \"INDIRAPURAM HABITAT CENTRE\" Retail Shops | Banquet Hall | Food Court | Studio | Virtual Space - With a burning desire to develop affordable real estate projects within the stipulated time.This establishment aims to bring together people of all ages while they spend their time enjoying the goodness of health and recreation."
                    ,"Lack of rest rooms but great place for shopping and eating with family&&&&A new mall which is easy to notice from the main road. The mall is still under construction at the back but the front part is up and running with number of shops for clothing, furniture, food, etc. Has variety of restaurants ( chinese, bakery, north indian, sweets, etc.). Though there are none of the fast food chains like McDonalds, KFC, etc. Also there limited pure veg options. Also there still isn't any arcade for games"
                    ,"+91 7026 90 91 92")
            ,new DetailsClass("Gaur Central Mall"
                    ,"A-1 to A-4, RDC, Opposite HDFC Bank, Raj Nagar, Ghaziabad, Uttar Pradesh 201002"
                    ,"10am - 10pm"
                    ,"The Gaur Central Mall is a very popular place for shopaholics in Ghaziabad City. Located in the posher area of Raj Nagar, it is often frequented by families but is also a popular place for youngsters. There is a wide selection of eateries at the food court including branded names like Pizza Hut and McDonald’s. It has a large number of retail outlets dealing in items across different categories from lifestyle accessories to fashion apparel. This includes stores from Adidas and Max to department stores like SPUR that sell all sorts of groceries, hardware, and necessary lifestyle items. It also has a cinema (PVR Cinema) with a large capacity, playing the latest Bollywood and Hollywood releases for your viewing pleasure."
                    ,"Nice place for shopping & eat so many type of food variety&&&&Impressive service, Nice location and highly gesture with environment"
                    ,"0120 282 0532")
    };

    public static final DetailsClass[] hotelInfo = {
            new DetailsClass("Fortune Inn Grazia"
                    ,"Plot No.1, District Centre, Sector 23, Sanjay Nagar, Ghaziabad, Uttar Pradesh 201002"
                    ,"Open 24/7"
                    ,"Fortune Inn Grazia, Ghaziabad, a contemporary full service hotel, captures the spirit of the new-age traveler and offers an array of guest facilities and services complemented with a range of modern amenities and technology. Conveniently located in the heart of the Industrial Area, adjacent to the ALT Centre, and in close proximity to all premier establishments in Sanjay Nagar like IMT Ghaziabad, Fortune Inn Grazia is perfectly suited to service the business requirements of the city."
                    ,"Proper hygiene maintaining authority. Really appreciate safety at this pandemic time. Staffs are very cooperative. Really enjoyed the stay and the food also is very good. Overall an excellent experience here.&&&&Nice hotel. Stayed for a week. Good ambience. Good staff, took care of everything needed in a better manner. Front desk Mr Faiz and Ms Pooja at restaurant were very kind in their services. Will be back again"
                    ,"0120 398 8442")
            ,new DetailsClass("Lemon Tree"
                    ,"Plot No. 1, Kaushambi;East Delhi Mall, Ghaziabad, Uttar Pradesh 201010"
                    ,"Open 24/7"
                    ,"Lemon Tree Hotel, in Kaushambi is on the top floor of the East Delhi Mall, in the heart of East Delhi’s commercial and residential buzz. A short distance from Noida, Ghaziabad, Sahibabad, Pragati Maidan and ITO, the hotel is also close to major tourist attractions like Akshardham and Old Fort"
                    ,"Though I was quarintined due to arrival by international flight, still never felt any kind of back fall of security and service. Specially two people I would definitely like to mention for their superb service are Rohit and Mehboob.&&&&Good service, clean room, timely and heathy food, overall a very good experience"
                    ,"0120 442 3232")
            ,new DetailsClass("Krishna Sagar"
                    ," C-48, R.D.C, Raj Nagar, Ghaziabad, Uttar Pradesh 201001"
                    ,"Open 24/7"
                    ,"Hotel Krishna Sagar is a well-established and highly reputed name in the domain of Budget Hotels in NCR. This exemplary hotel was founded in the year 2000, and it belongs to the prestigious chain of hotel, known as Krishna Sagar chain of Hotels & Restaurants.\n" + "Hotel Krishna Sagar offers a perfect solution to the accommodation needs of people, who prefer luxury and comforts, at affordable rates and our hotel is popular for the same.  Our sole purpose of establishing this hotel was to bring luxurious amenities and unmatchable comforts, in the purview of common people.With the kind of response we have got from our guests, we are pretty sure that, we have been able to achieve this goal."
                    ,"I have tried mostly South Indian food and very rarely North Indian food there and it has been mostly always up to mark and delicious, freshly prepared and timely served.It is very simplistic and charming as far facilities are concerned.&&&&The rooms are avarage rated but the restaurant's food taste is good. Staff of this hotel is supportive. But the building needs some maintenance properly. Various shopping malls are available around this hotel."
                    ,"0120 272 3633")
            ,new DetailsClass("Radisson Blu"
                    ,"H-3, Modipon Vihar, Sector 14, Kaushambi, Ghaziabad, Uttar Pradesh 201010"
                    ,"Open 24/7"
                    ,"Ideally located on the east side of Delhi, the five-star Radisson Blu Kaushambi Delhi NCR boasts top-notch amenities and a central location for corporate and leisure travelers. You can easily reach Delhi's businesses and attractions using the metro stations or the New Delhi Railway Station near our hotel in Ghaziabad. Spend the day outside at the Akshardham complex or Vidhayak Colony Park. You can browse the shops at Shipra Mall or learn about the country’s history and culture with a visit to India Gate and Red Fort, all less than nine miles from our hotel."
                    ,"I stayed in Redisson during my business trip to Noida, very nice hotel with good locality very near to Delhi boarder. Food is also very good & staff is courteous & they make sure that your stay is memorable.&&&&Great experience with the staff. The property is spacious and nicely done. All three restaurants provide for a nice partying environment. The staff is well trained and try and go beyond the call of duty to accommodate the customers expectation."
                    ," 0120 473 6200")
            ,new DetailsClass("Vaishalli Inn"
                    ," 339/4 SEC-4 VAISHALI GHAIZBAD, Ghaziabad, Uttar Pradesh 201010"
                    ,"Open 24/7"
                    ,"Offering a restaurant that serves a variety of Indian and International dishes, The Vaishali Inn is located in Ghaziabad. It is 500 m from Vaishali Metro Station. Free Wi-Fi access is available. Air-conditioned rooms here will provide you with a flat-screen satellite TV and a seating area. There is also an electric kettle. Featuring a shower, private bathrooms also come with free toiletries."
                    ,"Nice Stay. Rooms are small but neat & clean, bathroom is also clean, food is good. Location is easy to reach near Vashali Metro Station.&&&&The hotel's service was very prompt and nice. Breakfast was also very good. Overall nice stay."
                    ,"0120 424 3011")
    };

    public static final DetailsClass[] moviesInfo = {
            new DetailsClass("Wave Cinema"
                    ,"202, Maharana Pratap Marg, Block 1, P & T Colony, Raj Nagar, Ghaziabad, Uttar Pradesh 201002\n"
                    ,"11am - 11pm"
                    ," Wave Cinemas Gaur Central Mall Rdc is a chain of theatres in India that exhibit a myriad of movies around the year. Be it a Regional, Bollywood or Hollywood movie, at Wave Cinemas Gaur Central Mall Rdc you can catch them all.Book tickets online for Wave Cinemas Gaur Central Mall Rdc at Paytm and get ready for an entertainment-packed time with your friends and family! "
                    ,"This is a very good option of having a movie in the Kaushambi area. They have maintained it well. Food options are also decent. Suitable for family.&&&&Not very costly, good sound box and comfortable seating."
                    ,"0120 436 4666")
            ,new DetailsClass("PVR EDM"
                    ," Plot No.1,EDM Mall, Ghazipur Rd, Kaushambi, Ghaziabad, Uttar Pradesh 201010"
                    ,"11am - 11pm"
                    ,"PVR Ltd. is the market leader in terms of screen count in India. Since 1997, the brand has redefined the cinema industry and the way people watch movies in the country. The Company has, over the years, consistently added screens, both organically and inorganically, through strategic investments and acquisitions which includes ‘Cinemax Cinemas’ in November 2012, ‘DT Cinemas’ in May 2016 and ‘SPI Cinemas’ in August 2018 which added 138 screens, 32 screens and 76 screens respectively to our screen network. Currently, we operate 845 screens in 176 cinemas in 71 cities in India and Sri Lanka with an aggregate seating capacity of approximately 1.82 lakhs seats."
                    ,"It's a small shopping mall but best place for movie and shopping and also for foodies. Located near to Anand Vihar metro and ISBT. Very big parking place inside basement&&&&This pvr is a very old and established theatre for more than 15 years. The place is just nice enough to have a movie. Can’t compare with some of the better ones but still a nice option."
                    ,"088009 00009")
            ,new DetailsClass("SRS Cinema"
                    ,"1st Floor, Plot 12A, Jaipuria Sunrise Plaza, Doctor Sushila Naiyar Marg, Ahinsa Khand , Indirapuram, Ghaziabad, Uttar Pradesh 201301"
                    ,"11am - 11pm"
                    ,"Watching a movie is no longer limited to a weekend, it has become an everyday affair thanks to movie theatres with world-class facilities. Srs Jaipuria Mall Ghaziabad is a chain of theatres in India that exhibit a myriad of movies around the year. Be it a Regional, Bollywood or Hollywood movie, at Srs Jaipuria Mall Ghaziabad you can catch them all."
                    ,"It must be one of cheapest in NCR but provides a good screen and a nice sound system, food is a little overpriced for the quality. Staff is sweet.&&&&The only pros of visiting this cinema is cheap tickets. The seats are very average. The sound system is not great. The interiors are also quite average."
                    ,"0120 424 3011")
            ,new DetailsClass("Galaxie Multiplex"
                    ,"Local Road, Sahibabad Industrial Area Site 4, Sahibabad, Ghaziabad, Uttar Pradesh 201010"
                    ,"11am - 9:30pm"
                    ,"Watching a movie is no longer limited to a weekend, it has become an everyday affair thanks to movie theatres with world-class facilities. Galaxie Multiplex Ghaziabad is a chain of theatres in India that exhibit a myriad of movies around the year. Be it a Regional, Bollywood or Hollywood movie, at Galaxie Multiplex Ghaziabad you can catch them all."
                    ,"This is surely a value for money theatre and is famous among the local college goers. The parking is a bit problem but still a nice option.&&&&A Multi-screen theater with very reasonable price. Some of the seats needs repair, even though value for money. Even snacks and pop-corn are available at reasonable price."
                    ,"0120 424 3011")
            ,new DetailsClass("Carnival Cinema"
                    ,"A -1/1, Site 3, Meerut Rd, near ICICI Bank ATM, NCR, Sihani Chungi, Meerut Road Industrial Area, Ghaziabad, Uttar Pradesh 201003"
                    ,"10:30am - 11pm"
                    ,"Watching a movie is no longer limited to a weekend, it has become an everyday affair thanks to movie theatres with world-class facilities. Carnival World Square Mall Ghaziabad is a chain of theatres in India that exhibit a myriad of movies around the year. Be it a Regional, Bollywood or Hollywood movie, at Carnival World Square Mall Ghaziabad you can catch them all."
                    ,"Expensive but serve quality entertainment in this area. Most of the time it crowded. Lots of eating options as well&&&&The hall is clean and tidy and the entire facilities are good. Enough choices for snacks and refreshments"
                    ," 074000 61769")
    };

    public static final DetailsClass[] gamingInfo = {
            new DetailsClass("Arsenal"
                    ,"B-21/22 KPG Tower , Below MR.Brown Near Golds GYM RDC, Raj Nagar, Ghaziabad, Uttar Pradesh 201002"
                    ,"11am - 8pm"
                    ,"Very exclusive and best environment in city with hukka, food, drinks, and all games including movie theater, best place for couple and specially for female groups for their get-together. also best place for cocktails, birthday, couple kitty"
                    ,"Excellent place for having group fun with your friends , food menu though not that much appealing"
                    ,"084471 41136")
            ,new DetailsClass("Fun Toon World"
                    ,"The Opulent Mall, 3rd Floor, Ghaziabad, Uttar Pradesh 201001"
                    ,"11am - 6pm"
                    ,"Funtoon World is an ideal indoor Play Centre for kids & youngsters. Funtoon World forms an integral part in the society by providing a platform to children for social interactions and active play in a safe, secure and conveniently accessed location."
                    ,"Kids love it for sure .Staff is very efficient n warm &&&& Very nice place for kids n good lady staffs"
                    ,"91- 8448126006")
            ,new DetailsClass("Game Maniac"
                    ,"Plot No. - 422, Vijay Nagar Ghaziabad, Ghaziabad - 201009, Near 1st India Mart&&&&"
                    ,"12pm - 10pm"
                    ,"All in one center for console games. Play for any number of hours for fixed price"
                    ,"Very Good&&&&Its amazing"
                    ,"084471 41136")

    };


}




























