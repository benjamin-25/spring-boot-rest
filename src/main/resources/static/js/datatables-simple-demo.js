window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    const datatablesSimple = document.getElementById('datatablesSimple');
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple);
    }
    const user = async() => {
        const response = await fetch("https://randomuser.me/api/", {
            method: "GET",
            headers:{
                "content-type": "application/json",
            }
        });

        const data = await response?.json();
        console.log(data?.results);
    };

    user();
});
