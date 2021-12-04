package com.idn.murottalapp.data

import com.idn.murottalapp.R
import com.idn.murottalapp.utils.MediaService.Companion.activityContext

object DataSurah {
    private val mecca = activityContext.getString(R.string.mecca)
    private val medina = activityContext.getString(R.string.medina)

    private val files_30 = arrayOf(
        R.raw.annaba,
        R.raw.annaziat,
        R.raw.abasa,
        R.raw.attakwir,
        R.raw.alinfithar,
        R.raw.almuthaffifin,
        R.raw.alinsyiqaq,
        R.raw.alburuj,
        R.raw.aththariq,
        R.raw.alala,
        R.raw.alghasyiyah,
        R.raw.alfajr,
        R.raw.albalad,
        R.raw.asysyams,
        R.raw.allail,
        R.raw.adhdhuha,
        R.raw.alinsyirah,
        R.raw.attin,
        R.raw.alalaq,
        R.raw.alqadr,
        R.raw.albayyinah,
        R.raw.azzalzalah,
        R.raw.aladiyat,
        R.raw.alqariah,
        R.raw.attakatsur,
        R.raw.alashr,
        R.raw.alhumazah,
        R.raw.alfil,
        R.raw.quraisy,
        R.raw.almaun,
        R.raw.alkautsar,
        R.raw.alkafirun,
        R.raw.annashr,
        R.raw.allahab,
        R.raw.alikhlas,
        R.raw.alfalaq,
        R.raw.annas
    )

    private val files_29 = arrayOf(
        R.raw.almulk,
        R.raw.alqalam,
        R.raw.alhaqqah,
        R.raw.almaarij,
        R.raw.nuh,
        R.raw.aljinn,
        R.raw.almuzzammil,
        R.raw.almuddatstsir,
        R.raw.alqiyamah,
        R.raw.alinsan,
        R.raw.almursalat
    )

    private val files_27 = arrayOf(
        R.raw.adzdzariyat,
        R.raw.aththur,
        R.raw.annajm,
        R.raw.alqamar,
        R.raw.arrahman,
        R.raw.alwaqiah,
        R.raw.alhadid
    )

    /* private val files_30 = arrayOf(
        "annaba",
        "annaziat",
        "abasa",
        "attakwir",
        "alinfithar",
        "almuthaffifin",
        "alinsyiqaq",
        "alburuj",
        "aththariq",
        "alala",
        "alghasyiyah",
        "alfajr",
        "albalad",
        "asysyams",
        "allail",
        "adhdhuha",
        "alinsyirah",
        "attin",
        "alalaq",
        "alqadr",
        "albayyinah",
        "azzalzalah",
        "aladiyat",
        "alqariah",
        "attakatsur",
        "alashr",
        "alhumazah",
        "alfil",
        "quraisy",
        "almaun",
        "alkautsar",
        "alkafirun",
        "annashr",
        "allahab",
        "alikhlas",
        "alfalaq",
        "annas"
    )

    private val files_29 = arrayOf(
        "almulk",
        "alqalam",
        "alhaqqah",
        "almaarij",
        "nuh",
        "aljinn",
        "almuzzammil",
        "almuddatstsir",
        "alqiyamah",
        "alinsan",
        "almursalat"
    )

    private val files_27 = arrayOf(
        "adzdzariyat",
        "aththur",
        "annajm",
        "alqamar",
        "arrahman",
        "alwaqiah",
        "alhadid"
    ) */

    private val surahs_30 = arrayOf(
        "An-Naba’",
        "An-Nazi’at",
        "‘Abasa",
        "At-Takwir",
        "Al-Infitar",
        "Al-Mutaffifin",
        "Al-Inshiqaq",
        "Al-Buruj",
        "At-Tariq",
        "Al-A’la",
        "Al-Ghashiyah",
        "Al-Fajr",
        "Al-Balad",
        "Ash-Shams",
        "Al-Layl",
        "Adh-Dhuha",
        "Al-Inshirah",
        "At-Tin",
        "Al-‘Alaq",
        "Al-Qadar",
        "Al-Bayinah",
        "Az-Zalzalah",
        "Al-‘Adiyah",
        "Al-Qari’ah",
        "At-Takathur",
        "Al-‘Asr",
        "Al-Humazah",
        "Al-Fil",
        "Quraish",
        "Al-Ma’un",
        "Al-Kauthar",
        "Al-Kafirun",
        "An-Nasr",
        "Al-Masad",
        "Al-Ikhlas",
        "Al-Falaq",
        "An-Nas"
    )

    private val surahs_29 = arrayOf(
        "Al-Mulk",
        "Al-Qalam",
        "Al-Haqqah",
        "Al-Ma’arij",
        "Nuh",
        "Al-Jinn",
        "Al-Muzammil",
        "Al-Mudaththir",
        "Al-Qiyamah",
        "Al-Insan",
        "Al-Mursalat"
    )

    private val surahs_27 = arrayOf(
        "Adz-Dzariyah",
        "At-Tur",
        "An-Najm",
        "Al-Qamar",
        "Ar-Rahman",
        "Al-Waqi’ah",
        "Al-Hadid"
    )

    private val surahs_arabic_30 = arrayOf(
        "النبأ",
        "النّٰزعٰت",
        "عبس",
        "التكوير",
        "الانفطار",
        "المطفّفين",
        "الانشقاق",
        "البروج",
        "الطارق",
        "الاعلى",
        "الغاشية",
        "الفجر",
        "البلد",
        "الشمس",
        "الّيل",
        "الضحى",
        "الشرح",
        "التين",
        "العلق",
        "القدر",
        "البيّنة",
        "الزلزلة",
        "العٰديٰت",
        "القارعة",
        "التكاثر",
        "العصر",
        "الهمزة",
        "الفيل",
        "قريش",
        "الماعون",
        "الكوثر",
        "الكٰفرون",
        "النصر",
        "اللهب",
        "الاخلاص",
        "الفلق",
        "الناس"
        )

    private val surahs_arabic_29 = arrayOf(
        "الملك",
        "القلم",
        "الحاۤقّة",
        "المعارج",
        "نوح",
        "الجن",
        "المزّمّل",
        "المدّثّر",
        "القيٰمة",
        "الانسان",
        "المرسلٰت"
    )

    private val surahs_arabic_27 = arrayOf(
        "الذّٰريٰت",
        "الطور",
        "النجم",
        "القمر",
        "الرحمن",
        "الواقعة",
        "الحديد"
    )

    private val origins_30 = arrayOf(
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        medina,
        medina,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        medina,
        mecca,
        mecca,
        mecca,
        mecca
    )

    private val origins_29 = arrayOf(
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        medina,
        mecca
    )

    private val origins_27 = arrayOf(mecca,
        mecca,
        mecca,
        mecca,
        "$mecca & $medina",
        mecca,
        medina
    )

    private val amounts_30 = arrayOf(
        40,
        46,
        42,
        29,
        19,
        36,
        25,
        22,
        17,
        19,
        26,
        30,
        20,
        15,
        21,
        11,
        8,
        8,
        19,
        5,
        8,
        8,
        11,
        11,
        8,
        3,
        9,
        5,
        4,
        7,
        3,
        6,
        3,
        5,
        4,
        5,
        6
    )

    private val amounts_29 = arrayOf(30,
        52,
        52,
        44,
        28,
        28,
        20,
        56,
        40,
        31,
        50
    )

    private val amounts_27 = arrayOf(
        60,
        49,
        62,
        55,
        78,
        96,
        29
    )

    private val numbers_30 = (78..114).toList()

    private val numbers_29 = (67..77).toList()

    private val numbers_27 = (51..57).toList()

    val listSurah30: ArrayList<ListSurah>
        get() {
            val list = arrayListOf<ListSurah>()
            for (data in surahs_30.indices) {
                val surah = ListSurah(
                    file = files_30[data],
                    name = surahs_30[data],
                    name_arabic = surahs_arabic_30[data],
                    origin = origins_30[data],
                    amount = amounts_30[data],
                    numbers = numbers_30[data]
                )
                list.add(surah)
            }
            return list
        }

    val listSurah29: ArrayList<ListSurah>
        get() {
            val list = arrayListOf<ListSurah>()
            for (data in surahs_29.indices) {
                val surah = ListSurah(
                    file = files_29[data],
                    name = surahs_29[data],
                    name_arabic = surahs_arabic_29[data],
                    origin = origins_29[data],
                    amount = amounts_29[data],
                    numbers = numbers_29[data]
                )
                list.add(surah)
            }
            return list
        }

    val listSurah27: ArrayList<ListSurah>
        get() {
            val list = arrayListOf<ListSurah>()
            for (data in surahs_27.indices) {
                val surah = ListSurah(
                    file = files_27[data],
                    name = surahs_27[data],
                    name_arabic = surahs_arabic_27[data],
                    origin = origins_27[data],
                    amount = amounts_27[data],
                    numbers = numbers_27[data]
                )
                list.add(surah)
            }
            return list
        }

    /* private val files = arrayOf(
        R.raw.adzdzariyat,
        R.raw.aththur,
        R.raw.annajm,
        R.raw.alqamar,
        R.raw.arrahman,
        R.raw.alwaqiah,
        R.raw.alhadid,
        R.raw.almulk,
        R.raw.alqalam,
        R.raw.alhaqqah,
        R.raw.almaarij,
        R.raw.nuh,
        R.raw.aljinn,
        R.raw.almuzzammil,
        R.raw.almuddatstsir,
        R.raw.alqiyamah,
        R.raw.alinsan,
        R.raw.almursalat,
        R.raw.annaba,
        R.raw.annaziat,
        R.raw.abasa,
        R.raw.attakwir,
        R.raw.alinfithar,
        R.raw.almuthaffifin,
        R.raw.alinsyiqaq,
        R.raw.alburuj,
        R.raw.aththariq,
        R.raw.alala,
        R.raw.alghasyiyah,
        R.raw.alfajr,
        R.raw.albalad,
        R.raw.asysyams,
        R.raw.allail,
        R.raw.adhdhuha,
        R.raw.alinsyirah,
        R.raw.attin,
        R.raw.alalaq,
        R.raw.alqadr,
        R.raw.albayyinah,
        R.raw.azzalzalah,
        R.raw.aladiyat,
        R.raw.alqariah,
        R.raw.attakatsur,
        R.raw.alashr,
        R.raw.alhumazah,
        R.raw.alfil,
        R.raw.quraisy,
        R.raw.almaun,
        R.raw.alkautsar,
        R.raw.alkafirun,
        R.raw.annashr,
        R.raw.allahab,
        R.raw.alikhlas,
        R.raw.alfalaq,
        R.raw.annas
    )

    private val surahs = arrayOf(
        "Adz-Dzariyah",
        "At-Tur",
        "An-Najm",
        "Al-Qamar",
        "Ar-Rahman",
        "Al-Waqi’ah",
        "Al-Hadid",
        "Al-Mulk",
        "Al-Qalam",
        "Al-Haqqah",
        "Al-Ma’arij",
        "Nuh",
        "Al-Jinn",
        "Al-Muzammil",
        "Al-Mudaththir",
        "Al-Qiyamah",
        "Al-Insan",
        "Al-Mursalat",
        "An-Naba’",
        "An-Nazi’at",
        "‘Abasa",
        "At-Takwir",
        "Al-Infitar",
        "Al-Mutaffifin",
        "Al-Inshiqaq",
        "Al-Buruj",
        "At-Tariq",
        "Al-A’la",
        "Al-Ghashiyah",
        "Al-Fajr",
        "Al-Balad",
        "Ash-Shams",
        "Al-Layl",
        "Adh-Dhuha",
        "Al-Inshirah",
        "At-Tin",
        "Al-‘Alaq",
        "Al-Qadar",
        "Al-Bayinah",
        "Az-Zalzalah",
        "Al-‘Adiyah",
        "Al-Qari’ah",
        "At-Takathur",
        "Al-‘Asr",
        "Al-Humazah",
        "Al-Fil",
        "Quraish",
        "Al-Ma’un",
        "Al-Kauthar",
        "Al-Kafirun",
        "An-Nasr",
        "Al-Masad",
        "Al-Ikhlas",
        "Al-Falaq",
        "An-Nas"
    )

    private val surahs_arabic = arrayOf(
        "الذّٰريٰت",
        "الطور",
        "النجم",
        "القمر",
        "الرحمن",
        "الواقعة",
        "الحديد",
        "الملك",
        "القلم",
        "الحاۤقّة",
        "المعارج",
        "نوح",
        "الجن",
        "المزّمّل",
        "المدّثّر",
        "القيٰمة",
        "الانسان",
        "المرسلٰت",
        "النبأ",
        "النّٰزعٰت",
        "عبس",
        "التكوير",
        "الانفطار",
        "المطفّفين",
        "الانشقاق",
        "البروج",
        "الطارق",
        "الاعلى",
        "الغاشية",
        "الفجر",
        "البلد",
        "الشمس",
        "الّيل",
        "الضحى",
        "الشرح",
        "التين",
        "العلق",
        "القدر",
        "البيّنة",
        "الزلزلة",
        "العٰديٰت",
        "القارعة",
        "التكاثر",
        "العصر",
        "الهمزة",
        "الفيل",
        "قريش",
        "الماعون",
        "الكوثر",
        "الكٰفرون",
        "النصر",
        "اللهب",
        "الاخلاص",
        "الفلق",
        "الناس"
    )

    private val origins = arrayOf(
        mecca,
        mecca,
        mecca,
        "Madaniyyah & Makkiyyah",
        mecca,
        medina,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        medina,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        medina,
        medina,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        mecca,
        medina,
        mecca,
        mecca,
        mecca,
        mecca
    )

    private val amounts = arrayOf(
        60,
        49,
        62,
        55,
        78,
        96,
        29,
        52,
        52,
        44,
        28,
        28,
        20,
        56,
        40,
        31,
        50,
        40,
        46,
        42,
        29,
        19,
        36,
        25,
        22,
        17,
        19,
        26,
        30,
        20,
        15,
        21,
        11,
        8,
        8,
        19,
        5,
        8,
        8,
        11,
        11,
        8,
        3,
        9,
        5,
        4,
        7,
        3,
        6,
        3,
        5,
        4,
        5,
        6
    )

    private val numbers = (51..114).toList()

    val listSurah: ArrayList<ListSurah>
        get() {
            val list = arrayListOf<ListSurah>()
            for (data in surahs.indices) {
                val surah = ListSurah(
                    file = files[data],
                    name = surahs[data],
                    name_arabic = surahs_arabic[data],
                    origin = origins[data],
                    amount = amounts[data],
                    numbers = numbers[data]
                )
                list.add(surah)
            }
            return list
        } */
}