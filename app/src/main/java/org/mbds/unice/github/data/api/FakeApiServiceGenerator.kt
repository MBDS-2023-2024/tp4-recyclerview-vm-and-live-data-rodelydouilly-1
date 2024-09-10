package org.mbds.unice.github.data.api

import org.mbds.unice.github.data.model.User
import java.util.*

object FakeApiServiceGenerator {

    private fun DateCreation(): Date {
        val calendar = Calendar.getInstance()
        val currentYear = calendar.get(Calendar.YEAR)
        val randomYear = (currentYear - (0..10).random()) // Random year within the last 10 years
        calendar.set(randomYear, (0..11).random(), (1..28).random()) // Random month and day
        return calendar.time
    }

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://api.adorable.io/AVATARS/512/1.png",DateCreation(),true),
        User("002", "Paul", "https://api.adorable.io/AVATARS/512/2.png",DateCreation(),true),
        User("003", "Phil", "https://api.adorable.io/AVATARS/512/3.png",DateCreation(),true),
        User("004", "Guillaume", "https://api.adorable.io/AVATARS/512/4.png",DateCreation(),true),
        User("005", "Francis", "https://api.adorable.io/AVATARS/512/5.png",DateCreation(),true),
        User("006", "George", "https://api.adorable.io/AVATARS/512/6.png",DateCreation(),true),
        User("007", "Louis", "https://api.adorable.io/AVATARS/512/7.png",DateCreation(),true),
        User("008", "Mateo", "https://api.adorable.io/AVATARS/512/8.png",DateCreation(),true),
        User("009", "April", "https://api.adorable.io/AVATARS/512/9.png",DateCreation(),true),
        User("010", "Louise", "https://api.adorable.io/AVATARS/512/10.png",DateCreation(),true),
        User("011", "Elodie", "https://api.adorable.io/AVATARS/512/11.png",DateCreation(),true),
        User("012", "Helene", "https://api.adorable.io/AVATARS/512/12.png",DateCreation(),true),
        User("013", "Fanny", "https://api.adorable.io/AVATARS/512/13.png",DateCreation(),true),
        User("014", "Laura", "https://api.adorable.io/AVATARS/512/14.png",DateCreation(),true),
        User("015", "Gertrude", "https://api.adorable.io/AVATARS/512/15.png",DateCreation(),true),
        User("016", "Chloé", "https://api.adorable.io/AVATARS/512/16.png",DateCreation(),true),
        User("017", "April", "https://api.adorable.io/AVATARS/512/17.png",DateCreation(),true),
        User("018", "Marie", "https://api.adorable.io/AVATARS/512/18.png",DateCreation(),true),
        User("019", "Henri", "https://api.adorable.io/AVATARS/512/19.png",DateCreation(),true),
        User("020", "Rémi", "https://api.adorable.io/AVATARS/512/20.png",DateCreation(),true)
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://api.adorable.io/AVATARS/512/21.png",DateCreation(),true),
        User("022", "Geoffrey", "https://api.adorable.io/AVATARS/512/22.png",DateCreation(),true),
        User("023", "Simon", "https://api.adorable.io/AVATARS/512/23.png",DateCreation(),true),
        User("024", "André", "https://api.adorable.io/AVATARS/512/24.png",DateCreation(),true),
        User("025", "Leopold", "https://api.adorable.io/AVATARS/512/25.png",DateCreation(),true)
    )
}