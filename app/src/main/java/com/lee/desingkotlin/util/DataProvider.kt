package com.lee.desingkotlin.util

import com.lee.desingkotlin.R
import com.lee.desingkotlin.data.Category
import com.lee.desingkotlin.data.Item

/**
 * This class provides dummy-data for each category or data off all categories together
 */
class DataProvider {

    companion object {
        // Initialize Laptop Data
        val laptopList = initLaptopList()

        private fun initLaptopList(): MutableList<Item> {
            val laptops = mutableListOf<Item>()

            laptops.add(
                Item(imageId = R.drawable.laptop_1,
                    title = "Macbook PRO",
                    details = "2012 Model Macbook PRO for sell!",
                    price = 1200.00,
                    category = Category.LAPTOP,
                    postedOn = System.currentTimeMillis()
                )
            )
            laptops.add(
                Item(imageId = R.drawable.laptop_2,
                    title = "HP Notebook 15.6 Inch",
                    details = "2017 Newest HP Notebook 15.6 Inch Premium Flagship High Performance Laptop Computer (Intel Core i7-7500U 2.7GHz up to 3.5GHz, 16GB RAM, 128GB SSD, DVD, WiFi, HD Webcam, Windows 10 Home) Silver!",
                    price = 729.00,
                    category = Category.LAPTOP,
                    postedOn = System.currentTimeMillis()
                )
            )
            laptops.add(
                Item(imageId = R.drawable.laptop_3,
                    title = "HP Stream Laptop PC",
                    details = "HP Stream Laptop PC 14-ax010nr (Intel Celeron N3060, 4 GB RAM, 32 GB eMMC) with Office 365 Personal for one year",
                    price = 214.99,
                    category = Category.LAPTOP,
                    postedOn = System.currentTimeMillis()
                )
            )
            laptops.add(
                Item(imageId = R.drawable.laptop_4,
                    title = "Acer Chromebook",
                    details = "Acer Chromebook R 11 Convertible, 11.6-Inch HD Touch, Intel Celeron N3150, 4GB DDR3L, 32GB, Chrome, CB5-132T-C1LK",
                    price = 288.98,
                    category = Category.LAPTOP,
                    postedOn = System.currentTimeMillis()
                )
            )
            laptops.add(
                Item(imageId = R.drawable.laptop_5,
                    title = "Dell Latitude E6430 Premium",
                    details = "Dell Latitude E6430 Premium 14.1, Business Laptop Computer, Intel Dual Core i7-3520M up to 3.6GHz Processor, 8GB RAM, 256GB SSD, DVD, HDMI, 802.11bgn, Windows 10 Professional (Certified Refurbished)",
                    price = 429.00,
                    category = Category.LAPTOP,
                    postedOn = System.currentTimeMillis()
                )
            )
            laptops.add(
                Item(imageId = R.drawable.laptop_6,
                    title = "HP EliteBook",
                    details = "HP EliteBook 820 G3 Business Laptop: 12.5, Resolution: 1366x768, Intel i7-6600U, 1TB HDD, 16GB DDR4, Backlit Keys, FP Reader, Windows 10 Professional",
                    price = 879.99,
                    category = Category.LAPTOP,
                    postedOn = System.currentTimeMillis()
                )
            )

            return laptops
        }

        // Initialize Monitor Data
        val monitorList = initMonitorList()

        private fun initMonitorList(): MutableList<Item> {
            val monitors = mutableListOf<Item>()

            monitors.add(
                Item(imageId = R.drawable.monitor_1,
                    title = "LG 22M47VQ 22 inch",
                    details = "LG 22M47VQ 22 inch 2ms TN Gaming Monitor (1920 x 1080, VGA, DVI, HDMI, 250 cd/m2)",
                    price = 92.52,
                    category = Category.MONITOR,
                    postedOn = System.currentTimeMillis()
                )
            )
            monitors.add(
                Item(imageId = R.drawable.monitor_2,
                    title = "Dell U2715H 27 inch",
                    details = "Dell U2715H 27 inch LCD Monitor Black - (16:9, 2M:1, 350 cd/m2, 2560 x 1440, 8ms, HDMI)",
                    price = 357.97,
                    category = Category.MONITOR,
                    postedOn = System.currentTimeMillis()
                )
            )
            monitors.add(
                Item(imageId = R.drawable.monitor_3,
                    title = "Acer K242HLbd 24 inch - Black",
                    details = "Acer K242HLbd 24 inch Widescreen FHD LED Monitor (5 ms, 100 M:1, ACM 250 Nits, LED, DVI with HDCP)",
                    price = 120.70,
                    category = Category.MONITOR,
                    postedOn = System.currentTimeMillis()
                )
            )
            monitors.add(
                Item(imageId = R.drawable.monitor_4,
                    title = "ASUS VS197DE LED 18.5 inch",
                    details = "ASUS VS197DE Widescreen LED Monitor (1366 x 768, 5 ms, VGA, Excellent Visual Performance) - 18.5 inch, Black",
                    price = 65.99,
                    category = Category.MONITOR,
                    postedOn = System.currentTimeMillis()
                )
            )
            monitors.add(
                Item(imageId = R.drawable.monitor_5,
                    title = "Samsung 27-Inch Curved LED",
                    details = "Samsung C27F390 27-Inch Curved LED Monitor - Black Gloss",
                    price = 189.99,
                    category = Category.MONITOR,
                    postedOn = System.currentTimeMillis()
                )
            )

            return monitors
        }

        // Initialize Headphone Data
        val headphoneList = initHeadphoneList()

        private fun initHeadphoneList(): MutableList<Item> {
            val headphones = mutableListOf<Item>()

            headphones.add(
                Item(imageId = R.drawable.headphone_1,
                    title = "Gaming Headset Micolindun Headphone Gamer Microphone",
                    details = "Gaming Headset Micolindun Headphone Gamer Microphone Lightweight Adjustable Mic LED for PS4, PC, Laptop, Tablet, Phone, MAC with 3.5mm Metallic Bass Surround Sound Volume Control (Adapter Include)",
                    price = 19.99,
                    category = Category.HEADPHONE,
                    postedOn = System.currentTimeMillis()
                )
            )
            headphones.add(
                Item(imageId = R.drawable.headphone_2,
                    title = "EasySMX Gaming Headphone",
                    details = "EasySMX Comfortable LED 3.5mm Stereo Gaming LED Lighting Over-Ear Headphone Headset Headband with Mic for PC Computer Game with Noise Cancelling & Volume Control",
                    price = 16.99,
                    category = Category.HEADPHONE,
                    postedOn = System.currentTimeMillis()
                )
            )
            headphones.add(
                Item(imageId = R.drawable.headphone_3,
                    title = "Gaming Headset Micolindun Headphone Gamer Microphone",
                    details = "Gaming Headset Micolindun Headphone Gamer Microphone Lightweight Adjustable Mic LED for PS4, PC, Laptop, Tablet, Phone, MAC with 3.5mm Metallic Bass Surround Sound Volume Control (Adapter Include)",
                    price = 19.99,
                    category = Category.HEADPHONE,
                    postedOn = System.currentTimeMillis()
                )
            )
            headphones.add(
                Item(imageId = R.drawable.headphone_1,
                    title = "Gaming Headset Micolindun Headphone Gamer Microphone",
                    details = "Gaming Headset Micolindun Headphone Gamer Microphone Lightweight Adjustable Mic LED for PS4, PC, Laptop, Tablet, Phone, MAC with 3.5mm Metallic Bass Surround Sound Volume Control (Adapter Include)",
                    price = 19.99,
                    category = Category.HEADPHONE,
                    postedOn = System.currentTimeMillis()
                )
            )
            headphones.add(
                Item(imageId = R.drawable.headphone_1,
                    title = "Gaming Headset Micolindun Headphone Gamer Microphone",
                    details = "Gaming Headset Micolindun Headphone Gamer Microphone Lightweight Adjustable Mic LED for PS4, PC, Laptop, Tablet, Phone, MAC with 3.5mm Metallic Bass Surround Sound Volume Control (Adapter Include)",
                    price = 19.99,
                    category = Category.HEADPHONE,
                    postedOn = System.currentTimeMillis()
                )
            )

            return headphones
        }

        /**
         * Adds new Item on top of the list based on item-category
         */
        fun addItem(item: Item) {
            when (item.category) {
                Category.LAPTOP ->
                    laptopList.add(0, item)
                Category.MONITOR ->
                    monitorList.add(0, item)
                Category.HEADPHONE ->
                    headphoneList.add(0, item)
            }
        }
    }

}
