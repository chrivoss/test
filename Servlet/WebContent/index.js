$(document).ready(function () {
	var error = $('#error');
	var result = $('#result');
	var code = $('#code');
	
	$('#go').on('click', function () {
		fetch('Airport?airportCode=' + code.val())
			.then(function (res) {
				return res.ok ? res.text() : Promise.reject();
			})
			.then(function (data) {
				var parts = data.split('#');
				result.text(parts[0] + ' ' + parts[1] + ' ' + parts[2]);
			})
			.catch(function (e) {
				console.error(e);
				result.text('invalid Airport Code');
			});
	})
});