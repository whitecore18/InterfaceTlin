class AmbulanceService : EmergencyService("Скорая помощь", "103"), Describable {
    override fun activityDescription(): String {
        return "Предоставляет медицинскую помощь в экстренных ситуациях."
    }

    override fun getDescription(): String {
        return "Служба экстренного реагирования: $name, телефон: $phone. ${activityDescription()}"
    }
}
