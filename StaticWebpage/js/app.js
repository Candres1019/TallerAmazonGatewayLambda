const app = (function () {

    let datos;

    function setDatos() {
        datos = $("#datos").val();
    }

    function makeCalculations() {
        if ($("#datos").val() === "") {
            alert("No hay valores para calcular");
        } else {
            setDatos();
            const promise = $.get({
                url: "https://1j750dxxi3.execute-api.us-east-1.amazonaws.com/awsgatewaylambda/convert/fahrenheit/celsius?value=" + datos,
                contentType: "application/json",
            });
            promise.then(function (data) {
                const dataParcero = JSON.parse(data);
                const gradees = dataParcero.celsius;
                $("#celsiusG").text("Grados Celsius: " + gradees);
                $("#jsonResult").text(data);
            })
        }
    }

    return {
        makeCalculations: makeCalculations
    }

})();