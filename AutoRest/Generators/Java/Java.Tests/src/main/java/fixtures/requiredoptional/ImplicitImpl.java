/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.requiredoptional.models.Error;

public class ImplicitImpl implements Implicit {
    private ImplicitService service;
    AutoRestRequiredOptionalTestService client;

    public ImplicitImpl(RestAdapter restAdapter, AutoRestRequiredOptionalTestService client) {
        this.service = restAdapter.create(ImplicitService.class);
        this.client = client;
    }

    /**
     * Test implicitly required path parameter
     *
     * @param pathParameter the String value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error getRequiredPath(String pathParameter) throws ServiceException {
        if (pathParameter == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter pathParameter is required and cannot be null."));
        }
        try {
            ServiceResponse<Error> response = getRequiredPathDelegate(service.getRequiredPath(pathParameter), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = getRequiredPathDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Test implicitly required path parameter
     *
     * @param pathParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getRequiredPathAsync(String pathParameter, final ServiceCallback<Error> serviceCallback) {
        if (pathParameter == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter pathParameter is required and cannot be null.")));
        }
        service.getRequiredPathAsync(pathParameter, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getRequiredPathDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> getRequiredPathDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Test implicitly optional query parameter
     *
     * @param queryParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putOptionalQuery(String queryParameter) throws ServiceException {
        try {
            ServiceResponse<Void> response = putOptionalQueryDelegate(service.putOptionalQuery(queryParameter), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putOptionalQueryDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Test implicitly optional query parameter
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putOptionalQueryAsync(String queryParameter, final ServiceCallback<Void> serviceCallback) {
        service.putOptionalQueryAsync(queryParameter, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putOptionalQueryDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putOptionalQueryDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Test implicitly optional header parameter
     *
     * @param queryParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putOptionalHeader(String queryParameter) throws ServiceException {
        try {
            ServiceResponse<Void> response = putOptionalHeaderDelegate(service.putOptionalHeader(queryParameter), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putOptionalHeaderDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Test implicitly optional header parameter
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putOptionalHeaderAsync(String queryParameter, final ServiceCallback<Void> serviceCallback) {
        service.putOptionalHeaderAsync(queryParameter, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putOptionalHeaderDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putOptionalHeaderDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Test implicitly optional body parameter
     *
     * @param bodyParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putOptionalBody(String bodyParameter) throws ServiceException {
        try {
            ServiceResponse<Void> response = putOptionalBodyDelegate(service.putOptionalBody(bodyParameter), null);
            response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Void> response = putOptionalBodyDelegate(error.getResponse(), error);
            response.getBody();
        }
    }

    /**
     * Test implicitly optional body parameter
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void putOptionalBodyAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback) {
        service.putOptionalBodyAsync(bodyParameter, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putOptionalBodyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putOptionalBodyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Test implicitly required path parameter
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error getRequiredGlobalPath() throws ServiceException {
        if (this.client.getRequiredGlobalPath() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getRequiredGlobalPath() is required and cannot be null."));
        }
        try {
            ServiceResponse<Error> response = getRequiredGlobalPathDelegate(service.getRequiredGlobalPath(this.client.getRequiredGlobalPath()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = getRequiredGlobalPathDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Test implicitly required path parameter
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getRequiredGlobalPathAsync(final ServiceCallback<Error> serviceCallback) {
        if (this.client.getRequiredGlobalPath() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getRequiredGlobalPath() is required and cannot be null.")));
        }
        service.getRequiredGlobalPathAsync(this.client.getRequiredGlobalPath(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getRequiredGlobalPathDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> getRequiredGlobalPathDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Test implicitly required query parameter
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error getRequiredGlobalQuery() throws ServiceException {
        if (this.client.getRequiredGlobalQuery() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getRequiredGlobalQuery() is required and cannot be null."));
        }
        try {
            ServiceResponse<Error> response = getRequiredGlobalQueryDelegate(service.getRequiredGlobalQuery(this.client.getRequiredGlobalQuery()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = getRequiredGlobalQueryDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Test implicitly required query parameter
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getRequiredGlobalQueryAsync(final ServiceCallback<Error> serviceCallback) {
        if (this.client.getRequiredGlobalQuery() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getRequiredGlobalQuery() is required and cannot be null.")));
        }
        service.getRequiredGlobalQueryAsync(this.client.getRequiredGlobalQuery(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getRequiredGlobalQueryDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> getRequiredGlobalQueryDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Test implicitly optional query parameter
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Error getOptionalGlobalQuery() throws ServiceException {
        try {
            ServiceResponse<Error> response = getOptionalGlobalQueryDelegate(service.getOptionalGlobalQuery(this.client.getOptionalGlobalQuery()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = getOptionalGlobalQueryDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Test implicitly optional query parameter
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void getOptionalGlobalQueryAsync(final ServiceCallback<Error> serviceCallback) {
        service.getOptionalGlobalQueryAsync(this.client.getOptionalGlobalQuery(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getOptionalGlobalQueryDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> getOptionalGlobalQueryDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}