package com.abcd.aksan_aplikasisuratkantordesa.utils

import android.view.View
import com.abcd.aksan_aplikasisuratkantordesa.data.model.UsersModel

interface OnClickItem {
    interface ClickPesanan{
        fun clickPesanan(
            idPemesanan: Int
        )
    }

    interface ClickRiwayatPesanan{
        fun clickRiwayatPesanan(
            idPemesanan: Int
        )
    }

    interface ClickAkun{
        fun clickItemSetting(akun: UsersModel, it: View)
        fun clickItemAlamat(alamat: String, it: View)
    }

    // Wedding organizer
    // Vendor

    interface ClickAdminWeddingOrganizer{
        fun clickItemNama(title:String, nama: String)
        fun clickItemAlamat(title:String, alamat: String)
        fun clickItemUsername(title:String, username: String)
        fun clickItemDeskripsi(title:String, deskripsi: String)
        fun clickItemGambar(title:String, gambar: String)
        fun clickItemSetting(wo: UsersModel, it: View)
    }

    interface ClickAdminUser{
        fun clickItemNama(title:String, nama: String)
        fun clickItemAlamat(title:String, alamat: String)
        fun clickItemUsername(title:String, username: String)
        fun clickItemSetting(wo: UsersModel, it: View)
    }

}