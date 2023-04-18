import ServicesPublicRepository from "./k&sApi/ServicesPublicRepository";

export default class ApiRepository{
    api;

    constructor(apiToCharge){
        this.api = apiToCharge
        this.chooseApi()
    }
    
    chooseApi() {
        if (this.api === "services") return new ServicesPublicRepository;
            
        }
    }
