$('#confirmarExclusaoModal').on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget);
	
	var codigoTitulo 	= button.data('codigo');
	var descricaoTitulo = button.data('descricao');
	
	var modal  = $(this);
	var form   = modal.find('form');
	var action = form.data('url-base');
	
	form.attr('action', action + codigoTitulo);
	modal.find('.modal-body span').html('Você realmente deseja apagar o título <strong>' + descricaoTitulo + '<strong>?');
});

$(function(){
	$('[rel="tooltip"]').tooltip();
	$('.js-currency').maskMoney({decimal: ',', thousands: '.', allowZero: true});
	
	$('.js-atualizar-status').on('click', function(event){
		event.preventDefault();
		
		var botaoReceber = $(event.currentTarget);
		var urlReceber = botaoReceber.attr('href');
		
		var response = $.ajax({
			url: urlReceber,
			type: 'PUT' 
		});
		
		console.log(response);
	});
});