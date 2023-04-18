export default class ServicesPublicRepository{
    url = "http://localhost:8080/api/services";

    constructor() {}

    async getAll(){
        const response = await fetch(this.url);
        const json = await response.json();

        let servicesList = [];

        servicesList.push(json);

        return json;
    }
}