package com.emrealtunbilek.burcrehberiapp

import java.io.Serializable

/**
 * Created by Emre on 26.12.2017.
 */
data class Burc(var burcAdi:String, var burcTarih:String, var burcSembol:Int, var burcBuyukResim:Int, var burcGenelOzellikleri:String):Serializable{


}